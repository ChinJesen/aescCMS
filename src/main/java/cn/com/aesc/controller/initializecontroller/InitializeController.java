/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: initializeController
 * Author:   dawn@acdiost.com
 * Date:     2018-10-09 16:16
 * Description: 加载时调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.controller.initializecontroller;

import cn.com.aesc.entity.Departments;
import cn.com.aesc.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈加载时调用〉
 *
 * @author dawn@acdiost.com
 * @create 2018-10-09
 * @since 1.0.0
 */
@RestController
@RequestMapping("/initialize")
public class InitializeController {

    @Autowired
    private DepartmentsService departmentsService;
    @RequestMapping("/department")
    String departmentHtml(Model model) {
        List<Departments> initDepartmentsList = departmentsService.selectDepartmentsInfo();
        model.addAttribute(initDepartmentsList);
        return "1";
    }
}
