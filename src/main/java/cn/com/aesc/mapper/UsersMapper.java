package cn.com.aesc.mapper;

import cn.com.aesc.entity.Users;
import cn.com.aesc.entity.UsersExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * 
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-08 16:24
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 
 */
public interface UsersMapper extends AescMapper<Users> {
    
    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-08 16:23
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    long countByExample(UsersExample example);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-08 16:23
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    int deleteByExample(UsersExample example);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-08 16:23
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     *
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-12 14:12
     * @Param:
     * @Return:
     * @See:
     * @Throws:
     * @Version:
     * @Description:
     */
    @Select("select userName from users")
    Users selectByExamples(String example);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-08 16:23
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * Copyright (C), 2005-2018, 重庆汽博实业有限公司
     * 
     * @Author: dawn@acdiost.com
     * @Date: 2018-06-08 16:23
     * @Param: 
     * @Return: 
     * @See: 
     * @Throws: 
     * @Version: 
     * @Description: 
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}