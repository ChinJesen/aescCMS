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
}
