/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: CustomShiroRealm
 * Author:   dawn@acdiost.com
 * Date:     2018-06-14 15:44
 * Description: 自定义的shiroRealm
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的shiroRealm〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-14
 * @since 1.0.0
 */
public class CustomShiroRealm extends AuthorizingRealm {

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 15:49
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 授权
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    return null;
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 15:49
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 认证
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    return null;
  }
}
