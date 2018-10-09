/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserController
 * Author:   dawn@acdiost.com
 * Date:     2018-05-22 12:34
 * Description: 用户管理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.controller.usercontroller;

import cn.com.aesc.entity.users.Users;
import cn.com.aesc.service.UserService;
import cn.com.aesc.utils.PasswordEncryption;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户管理类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-22
 * @since 1.0.0
 */


@Controller
@RequestMapping("/users")
public class UserController {
  private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

  @Resource
  private UserService userService;

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-24 9:23
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:返回到用户管理界面
   */
  @RequestMapping("/userManagement")
  String userManagementHtml(){
    return "sysHtml/userHtml/users";
  }

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * 
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-21 11:16
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 查询用户
 */


  @GetMapping("/user")
  @ResponseBody
  public Map<String,Object> getAllUsers(Users user, String draw,
                                   @RequestParam(required = false, defaultValue = "1") int start,
                                   @RequestParam(required = false, defaultValue = "10") int length){
    Map<String,Object> map = new HashMap<>();
    PageInfo<Users> pageInfo = userService.selectByPage(user, start, length);
    map.put("draw",draw);
    map.put("recordsTotal",pageInfo.getTotal());
    map.put("recordsFiltered",pageInfo.getTotal());
    map.put("data", pageInfo.getList());
    return map;
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-24 9:23
   * @Param:users
   * @Return:返回添加用户成功或者失败的结果（ResponseBody）到前端显示。
   * @See:cn.com.aesc.utils.PasswordEncryption类
   * @Throws:保存失败的异常
   * @Version:
   * @Description:添加用户操作 密码在utils里的PasswordEncryption类进行设置 随后mapper存储到数据库
   */
  @PostMapping("/user")
  @ResponseBody
  String addUser(Users users) {
    try {
      // 查询用户名是否存在
      Users user = userService.selectByUsername(users.getUsername());
      if (user != null){
        return "gaiYongHuYiCunZai";
      }
      // 账户启用
      users.setEnable(1);
      // 进行密码的加密，以及其他资料存储数据库
      PasswordEncryption passwordEncryption = PasswordEncryption.getPasswordEncryption();
      passwordEncryption.encryptPassword(users);
      userService.save(users);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "baoCunShiBai";
    }
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 11:14
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:修改用户
   */
  @PutMapping("/user")
  @ResponseBody
  String ModifyUser(Users users){
    LOGGER.info(users.toString());
    // 查询用户名是否存在
    Users user = userService.selectByUsername(users.getUsername());
    if (user != null){
      return "gaiYongHuYiCunZai";
    }
    try {
      PasswordEncryption passwordEncryption = PasswordEncryption.getPasswordEncryption();
      passwordEncryption.encryptPassword(users);
      userService.updateAll(users);
      return "success";
    }catch (Exception e){
      e.printStackTrace();
      return "fail";
    }

  }

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
   * @Description: 修改用户前，先查询用户是否存在，并把信息展示出来
   */
  @GetMapping("/getUserInfo")
  @ResponseBody
  Users getUserInfo(Integer id){
      Users users = userService.getUserInfo(id);
      return users;
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-14 11:15
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:删除用户
   */
  @DeleteMapping("/user")
  @ResponseBody
  String DeleteUser(Integer id){
    LOGGER.info("删除用户的ID是:"+id);
    try {
      userService.deleteUser(id);
      return "success";
    }catch (Exception e){
      return "fail";
    }

  }
}
