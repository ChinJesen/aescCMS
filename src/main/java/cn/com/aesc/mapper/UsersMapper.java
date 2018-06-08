package cn.com.aesc.mapper;

import cn.com.aesc.pojo.Users;
import cn.com.aesc.pojo.UsersExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
    long countByExamples(UsersExample example);

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
    int deleteByExamples(UsersExample example);

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
    List<Users> selectByExamples(UsersExample example);

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
    int updateByExampleSelectives(@Param("record") Users record, @Param("example") UsersExample example);

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
    int updateByExamples(@Param("record") Users record, @Param("example") UsersExample example);
}