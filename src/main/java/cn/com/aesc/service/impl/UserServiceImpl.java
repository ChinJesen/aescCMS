/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-06-12 14:05
 * Description: UserService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl;

import cn.com.aesc.mapper.UsersMapper;
import cn.com.aesc.entity.users.Users;
import cn.com.aesc.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserService实现类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-12
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl extends IBaseServiceImpl<Users> implements UserService{


  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 16:15
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 通过用户名查询该用户是否存在，可用于登录、添加、修改用户
   */
  @Override
  public Users selectByUsername(String username) {
    Example example = new Example(Users.class);
    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("username",username);
    List<Users> userList = selectByExample(example);
    if(userList.size()>0){
      return userList.get(0);
    }
    return null;
  }
}
