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
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

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
    public PageInfo<Departments> selectDepartmentsInfo() {
        return null;
    }
}
