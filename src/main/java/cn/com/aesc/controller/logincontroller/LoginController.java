package cn.com.aesc.controller.logincontroller;

import cn.com.aesc.entity.users.Users;
import cn.com.aesc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

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
  @PostMapping("/login")
  String login(Users users , Model model, Map<String,Object> map) {

    if (StringUtils.isEmpty(users.getUsername()) || StringUtils.isEmpty(users.getPassword())) {
      model.addAttribute("msg", "用户名或密码错误！");
      return "login";
    }
    Users u = userService.selectByUsername(users.getUsername());
    if(u != null){
      model.addAttribute("username",users.getUsername());
      model.addAttribute("request","欢迎使用合同管理系统");
      map.put("map","你好，");
      return "baseTemplate/main";
    }
    logger.info("用户名:"+users.getUsername());
    logger.info("密码:"+users.getPassword());
    return "baseTemplate/main";
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
