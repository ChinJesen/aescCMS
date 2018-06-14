package cn.com.aesc.service;

import cn.com.aesc.entity.users.Users;

public interface UserService extends IBaesService<Users>{

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 16:11
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:
   */
  Users selectByUsername(String username);
}
