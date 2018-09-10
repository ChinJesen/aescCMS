/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: RoleController
 * Author:   dawn@acdiost.com
 * Date:     2018-07-17 10:27
 * Description: 角色权限管理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.controller.usercontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br> 
 * 〈角色权限管理〉
 *
 * @author dawn@acdiost.com
 * @create 2018-07-17
 * @since 1.0.0
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-08-03 15:34
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 返回角色管理的视图
     */
    @RequestMapping("/role")
    ModelAndView role (){
        ModelAndView modelAndView = new ModelAndView("sysHtml/roleHtml/role");
        return modelAndView;
    }
    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     *
     * @Author: dawn@acdiost.com
     * @Date: 2018-07-18 9:56
     * @Param:
     * @Return:
     * @See:
     * @Throws:
     * @Version:
     * @Description: 获取权限信息
     */
    @GetMapping("/obtainPermissionInfo")
    String obtainPermissionInfo(int id) {
        System.out.println(id);
        return "id";
    }
}
