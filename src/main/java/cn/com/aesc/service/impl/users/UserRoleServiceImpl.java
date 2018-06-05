/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserRoleServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-06-04 14:03
 * Description: 用户权限service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl.users;

import cn.com.aesc.pojo.users.UserRole;
import cn.com.aesc.service.impl.BaseService;
import cn.com.aesc.service.users.UserRoleService;
import cn.com.aesc.shiro.CustomizeRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户权限service〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-04
 * @since 1.0.0
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends BaseService<UserRole> implements UserRoleService {

  @Autowired
  private CustomizeRealm customizeRealm;

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-04 14:15
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:
   */
  @Override
  @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
  public void addUserRole(UserRole userRole) {
    // 删除
    Example example = new Example(UserRole.class);
    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("userid",userRole.getUserid());
    mapper.deleteByExample(example);
    // 添加
    String[] roleids = userRole.getRoleid().split(",");
    for (String roleId : roleids) {
      UserRole u = new UserRole();
      u.setUserid(userRole.getUserid());
      u.setRoleid(roleId);
      mapper.insert(u);
    }
    // 更新当前登录的用户的权限缓存
    List<Integer> userid = new ArrayList<Integer>();
    userid.add(userRole.getUserid());
    customizeRealm.clearUserAuthByUserId(userid);
  }
}
