package cn.com.aesc.loginController;

import cn.com.aesc.pojo.users.Users;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * @Author: dawn@acdiost.com
 * @Date: 2018-05-08 14:08
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 
 */
@Controller
public class LoginController {


  private Logger logger = LoggerFactory.getLogger(LoginController.class);
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-10 12:57
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:
   */
  @RequestMapping(value = "/login",method = RequestMethod.GET)
  String login() {
    return "login";
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-10 12:57
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:
   */
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  String login(HttpServletRequest request, Model model, Users users) {
    System.out.println(users.getUserName());
    System.out.println(users.getPassword());
    return "guanLiHtml/manager";
  }

  @RequestMapping("/loginOut")
  String loginOut(){
    return "login";
  }
}
