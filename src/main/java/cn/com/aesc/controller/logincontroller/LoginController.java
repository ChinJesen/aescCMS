package cn.com.aesc.controller.logincontroller;

import cn.com.aesc.pojo.Users;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
  String login(HttpServletRequest request, Model model, Users users) {

    logger.info("用户名:"+users.getUsername());
    logger.info("密码:"+users.getPassword());
    return "manageHtml/main";
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
