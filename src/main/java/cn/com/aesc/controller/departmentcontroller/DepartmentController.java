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
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    @GetMapping("/department")
    String getDepartmentList(){
        // 去数据库读取出部门信息列表返回到页面
        Map<String,Object> map = new HashMap<>();
        PageInfo<Departments> pageInfo = departmentsService.selectDepartmentsInfo();
        return "sysHtml/departmentHtml/department";
    }
}
