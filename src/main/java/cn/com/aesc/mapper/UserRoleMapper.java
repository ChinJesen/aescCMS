package cn.com.aesc.mapper;

import cn.com.aesc.pojo.users.UserRole;
import cn.com.aesc.utils.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-04 15:49
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 
   */
  List<Integer> findUserIdByRoleId(Integer roleId);
}
