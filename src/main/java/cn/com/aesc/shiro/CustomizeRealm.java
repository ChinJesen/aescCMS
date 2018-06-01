/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: custonizeRealm
 * Author:   dawn@acdiost.com
 * Date:     2018-06-01 9:27
 * Description: 自定义的realm
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.shiro;

import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.pojo.users.Users;
import cn.com.aesc.service.resources.ResourcesService;
import cn.com.aesc.service.users.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.util.ByteSource;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的realm〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-01
 * @since 1.0.0
 */
public class CustomizeRealm extends AuthorizingRealm {

  @Resource
  private UserService userService;

  @Resource
  private ResourcesService resourcesService;

  @Autowired
  private RedisSessionDAO redisSessionDAO;
  // 授权

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    Users user = (Users) SecurityUtils.getSubject().getPrincipal();
    Map<String,Object> map = new HashMap<String, Object>();
    map.put("userId",user.getUserId());
    List<Resources> resourcesList = resourcesService.loadUserResources(map);
    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
    for (Resources resources : resourcesList){
      info.addStringPermission(resources.getResources_url());
    }
    return info;
  }

  // 认证

  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
    // 获取用户名
    String userName = (String) authenticationToken.getPrincipal();
    Users users = userService.selectByUserName(userName);
    if (users == null){
      throw new UnknownAccountException();
    }
    if (0 == users.getEnable()){
      // 账号不可用
      throw new LockedAccountException();
    }
    SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(users,users.getPassword(),ByteSource.Util.bytes(userName),getName());
    // 当验证通过后，把用户信息放入session
    Session session = SecurityUtils.getSubject().getSession();
    session.setAttribute("userSession", users);
    session.setAttribute("userSessionId", users.getUserId());
    return simpleAuthenticationInfo;
  }

  
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 17:06
   * @Param: userIds 已经修改了权限的userId
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 根据userId 清除当前session存在的用户的权限缓存
   */
  void clearUserAuthByUserId(List<Integer> userIds){
    if(null == userIds || userIds.size() == 0){
      return ;
    }
    //获取所有session
    Collection<Session> sessions = redisSessionDAO.getActiveSessions();
    //定义返回
    List<SimplePrincipalCollection> list = new ArrayList<SimplePrincipalCollection>();
    for (Session session:sessions){
      //获取session登录信息。
      Object obj = session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
      if(null != obj && obj instanceof SimplePrincipalCollection){
        //强转
        SimplePrincipalCollection spc = (SimplePrincipalCollection)obj;
        //判断用户，匹配用户ID。
        obj = spc.getPrimaryPrincipal();
        if(null != obj && obj instanceof Users){
          Users user = (Users) obj;
          System.out.println("user:"+user);
          //比较用户ID，符合即加入集合
          if(null != user && userIds.contains(user.getUserId())){
            list.add(spc);
          }
        }
      }
    }
    RealmSecurityManager securityManager =
            (RealmSecurityManager) SecurityUtils.getSecurityManager();
    CustomizeRealm realm = (CustomizeRealm)securityManager.getRealms().iterator().next();
    for (SimplePrincipalCollection simplePrincipalCollection : list) {
      realm.clearCachedAuthorizationInfo(simplePrincipalCollection);
    }
  }
}
