package cn.com.aesc.service;

import cn.com.aesc.entity.Departments;

import java.util.List;

public interface DepartmentsService extends IBaesService<Departments> {
    
    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-09-28 15:41
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description:  查询所有部门信息
     */
    List<Departments> selectDepartmentsInfo();

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-10-09 9:11
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description:
     */
    Departments selectByDepartmentName(String departmentname);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-10-09 14:02
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    Departments getDepartmentInfo(Integer id);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-10-09 15:15
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 删除部门
     */
    void deleteDepartment(Integer id);
}
