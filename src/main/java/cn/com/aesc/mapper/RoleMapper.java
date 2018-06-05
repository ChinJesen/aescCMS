package cn.com.aesc.mapper;

import cn.com.aesc.pojo.users.Roles;
import cn.com.aesc.utils.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Roles> {

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-04 15:42
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:
   */
  List<Roles> queryRoleListWithSelected(Integer id);
}
