/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: IBaseServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-06-14 15:58
 * Description: 实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl;

import cn.com.aesc.service.IBaesService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-14
 * @since 1.0.0
 */
public class IBaseServiceImpl<T> implements IBaesService<T> {

  @Autowired
  protected Mapper<T> mapper;

  public Mapper<T> getMapper() {
    return mapper;
  }

  @Override
  public T selectByKey(Object key) {
    return mapper.selectByPrimaryKey(key);
  }

  @Override
  public int save(T entity) {
    return mapper.insert(entity);
  }

  @Override
  public int delete(Object key) {
    return mapper.deleteByPrimaryKey(key);
  }

  @Override
  public int updateAll(T entity) {
    return mapper.updateByPrimaryKey(entity);
  }

  @Override
  public int updateNotNull(T entity) {
    return mapper.updateByPrimaryKeySelective(entity);
  }

  @Override
  public List<T> selectByExample(Object example) {
    return mapper.selectByExample(example);
  }
}
