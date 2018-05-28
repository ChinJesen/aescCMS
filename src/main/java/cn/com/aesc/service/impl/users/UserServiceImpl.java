/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-05-28 16:39
 * Description: 用户增删改查实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl.users;

import cn.com.aesc.pojo.users.Users;
import cn.com.aesc.service.impl.BaseService;
import cn.com.aesc.service.users.UserService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户增删改查实现类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-28
 * @since 1.0.0
 */
public class UserServiceImpl extends BaseService<Users> implements UserService {

  @Override
  public Users selectByUserName(String userName) {

    Example example = new Example(Users.class);
    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("userName",userName);
    List<Users> usersList = selectByExample(example);
    if (usersList.size() > 0){
      return usersList.get(0);
    }
    return null;
  }
}
