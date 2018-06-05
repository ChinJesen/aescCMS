package cn.com.aesc.service.users;

import cn.com.aesc.pojo.users.UserRole;
import cn.com.aesc.service.IService;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 *
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-04 14:09
 * @Param:
 * @Return:
 * @See:
 * @Throws:
 * @Version:
 * @Description:
 */
public interface UserRoleService extends IService<UserRole> {

  void addUserRole(UserRole userRole);
}
