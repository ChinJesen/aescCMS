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
import cn.com.aesc.entity.Users;
import cn.com.aesc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserService实现类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-12
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UsersMapper usersMapper;
  @Override
  public Users selectByExamples(String example) {
    return this.usersMapper.selectByExamples(example);
  }
}
