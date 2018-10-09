/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: DepartmentsServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-09-26 11:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl;

import cn.com.aesc.entity.Departments;
import cn.com.aesc.service.DepartmentsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author dawn@acdiost.com
 * @create 2018-09-26
 * @since 1.0.0
 */
@Service("departmentsService")
public class DepartmentsServiceImpl extends IBaseServiceImpl<Departments> implements DepartmentsService {

    @Override
    public List<Departments> selectDepartmentsInfo() {
        Example example = new Example(Departments.class);
        Example.Criteria criteria = example.createCriteria();
        List<Departments> departmentsList = selectByExample(example);
        return departmentsList;
    }

    @Override
    public Departments selectByDepartmentName(String departmentname) {
        Example example = new Example(Departments.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("departmentname",departmentname);
        List<Departments> departmentsList = selectByExample(example);
        if (departmentsList.size() > 0 ){
            return departmentsList.get(0);
        }
        return null;
    }

    @Override
    public Departments getDepartmentInfo(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteDepartment(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

}
