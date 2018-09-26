package cn.com.aesc.service;

import cn.com.aesc.entity.Departments;
import com.github.pagehelper.PageInfo;

public interface DepartmentsService extends IBaesService<Departments> {
    PageInfo<Departments> selectDepartmentsInfo();
}
