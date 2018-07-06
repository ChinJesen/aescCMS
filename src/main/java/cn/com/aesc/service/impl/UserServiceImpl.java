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

import cn.com.aesc.entity.users.Users;
import cn.com.aesc.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

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

  @Override
  public PageInfo<Users> selectByPage(Users user, int start, int length) {
    int page = start/length+1;
    Example example = new Example(Users.class);
    Example.Criteria criteria = example.createCriteria();
    // property要和实体类对应不和数据库字段对应
    if (StringUtil.isNotEmpty(user.getUsername())) {
      criteria.andLike("username", "%" + user.getUsername() + "%");
    }
    if (user.getUserid() != null) {
      criteria.andEqualTo("userid", user.getUserid());
    }
    if (user.getEnable() != null) {
      criteria.andEqualTo("enable", user.getEnable());
    }
    //分页查询
    PageHelper.startPage(page, length);
    List<Users> userList = selectByExample(example);
    return new PageInfo<>(userList);
  }

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

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-07-02 14:30
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 删除用户。shiro设置了后还需要删除权限信息。
   */
  @Override
  @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
  public void deleteUser(Integer id) {
    mapper.deleteByPrimaryKey(id);
    
  }

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
   * @Description: 通过id查询用户
   */
  @Override
  public Users getUserInfo(Integer id) {
    return mapper.selectByPrimaryKey(id);
  }
}
