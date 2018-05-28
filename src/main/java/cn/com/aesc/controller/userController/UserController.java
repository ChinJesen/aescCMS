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
package cn.com.aesc.controller.userController;

import cn.com.aesc.pojo.users.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户管理类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-22
 * @since 1.0.0
 */


@Controller
public class UserController {
  private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
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
  @RequestMapping("/userManagement")
  String inquiryAllUsers(){
    return "userHtml/users";
  }

}
