package cn.com.aesc.service;

import cn.com.aesc.entity.users.Users;
import com.github.pagehelper.PageInfo;

public interface UserService extends IBaesService<Users>{

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-09-28 15:40
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 查询所有用户信息
   */
  PageInfo<Users> selectByPage(Users user, int start, int length);

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
   * @Description: 通过名字查询用户信息
   */
  Users selectByUsername(String username);

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-07-03 12:50
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 删除用户
   */
    void deleteUser(Integer id);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-07-03 12:54
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 得到单个用户信息
     */
    Users getUserInfo(Integer id);
}
