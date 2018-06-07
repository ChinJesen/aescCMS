package cn.com.aesc.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * 
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-07 11:49
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 
 */
public interface AescMapper <T> extends Mapper<T>, MySqlMapper<T> {
}
