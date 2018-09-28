/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: DepartmentController
 * Author:   dawn@acdiost.com
 * Date:     2018-09-04 10:47
 * Description: 部门管理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.controller.departmentcontroller;

import cn.com.aesc.entity.Departments;
import cn.com.aesc.service.DepartmentsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈部门管理〉
 *
 * @author dawn@acdiost.com
 * @create 2018-09-04
 * @since 1.0.0
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Resource
    private DepartmentsService departmentsService;

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-09-28 16:09
     * @Param: 
     * @Return: 
     * @See:
     * @Throws: 
     * @Version: 
     * @Description: 返回到部门页面
     */
    @GetMapping("/department")
    String departmentHtml(Model model){
        List<Departments> departmentsList = departmentsService.selectDepartmentsInfo();
        model.addAttribute(departmentsList);
        return "sysHtml/departmentHtml/department";
    }

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * 
 * @Author: dawn@acdiost.com
 * @Date: 2018-09-28 16:22
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 去数据库读取出部门信息列表然后渲染到页面table
 */
    @GetMapping("/departmentsInfo")
    @ResponseBody
    List<Departments> departmentsInfo(){
        return departmentsService.selectDepartmentsInfo();
    }
}
