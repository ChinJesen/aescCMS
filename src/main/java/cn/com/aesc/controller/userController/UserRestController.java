/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserRestController
 * Author:   dawn@acdiost.com
 * Date:     2018-05-28 16:09
 * Description: 返回字符串到前台的数据
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.controller.userController;

import cn.com.aesc.pojo.users.Users;
import cn.com.aesc.service.users.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈返回字符串到前台的数据〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserRestController {

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
   * @Description:
   */
  @RequestMapping("/addUser")
  String addUsers(Users users){
    Users user = userService.selectByUserName(users.getUserName());
    if (user != null){
      return "gaiYongHuYiCunAZai";
    }
    // 账户启用
    users.setEnable(1);
    // TODO 进行密码的加密，以及其他资料存储数据库
    LOGGER.info(users.getUserName());
    LOGGER.info(users.getPassword());


    return "yonghuyicunzai";
  }
}
