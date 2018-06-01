package cn.com.aesc.controller.logincontroller;

import cn.com.aesc.pojo.users.Users;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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

  public String error;
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
   * @Description:用户直接登录页面get方法
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
  String login(HttpServletRequest request, Users users) {
    /*if (StringUtils.isEmpty(users.getUserName()) || StringUtils.isEmpty(users.getPassword())) {
      request.setAttribute("msg", "用户名或密码不能为空！");
      return "login";
    }
    Subject subject = SecurityUtils.getSubject();
    UsernamePasswordToken token = new UsernamePasswordToken(users.getUserName(), users.getPassword());
    try {
      subject.login(token);
      return "manageHtml/main";
    }catch (LockedAccountException lae){
      token.clear();
      return "login";
    }catch (AuthenticationException ae){
      token.clear();
      return "login";
    }*/
    return "manageHtml/main";
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-31 16:53
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:用户退出
   */
  @RequestMapping("/logout")
  String logout(){
    return "login";
  }


  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-31 16:54
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 发生错误时跳出的错误页面
   */
  @RequestMapping("/err")
  String error(Model model){
    model.addAttribute("error",error);
    return "error";
  }
}
