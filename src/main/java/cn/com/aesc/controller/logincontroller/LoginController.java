package cn.com.aesc.controller.logincontroller;

import cn.com.aesc.entity.Users;
import cn.com.aesc.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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

@Resource(name = "userService")
private UserService userService;

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
  //@RequestMapping(value = "/login",method = RequestMethod.GET)
  @GetMapping("/login")
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
  //@RequestMapping(value = "/login",method = RequestMethod.POST)
  @PostMapping("/login")
  String login(HttpServletRequest request, Users users) {
    if (StringUtils.isEmpty(users.getUsername()) || StringUtils.isEmpty(users.getPassword())) {
      request.setAttribute("msg", "用户名或密码不能为空！");
      return "login";
    }
    Users u = userService.selectByExamples(users.getUsername());
    if(u != null){
      request.setAttribute("msg", "有该用户！");
      return "manageHtml/main";
    }
    logger.info("用户名:"+users.getUsername());
    logger.info("密码:"+users.getPassword());
    return "redirect:manageHtml/main";
  }

  
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-07 17:52
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 
   */
  @RequestMapping("/logout")
  String logout(){
    return "login";
  }
}
