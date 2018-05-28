/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: BaseService
 * Author:   dawn@acdiost.com
 * Date:     2018-05-28 16:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl;

import cn.com.aesc.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-28
 * @since 1.0.0
 */
public abstract class BaseService<T> implements IService<T> {
  @Autowired
  protected Mapper<T> mapper;

  public Mapper<T> getMapper() {
    return mapper;
  }

  @Override
  public T selectByKey(Object key) {
    return mapper.selectByPrimaryKey(key);
  }

  public int save(T entity) {
    return mapper.insert(entity);
  }

  public int delete(Object key) {
    return mapper.deleteByPrimaryKey(key);
  }

  public int updateAll(T entity) {
    return mapper.updateByPrimaryKey(entity);
  }

  public int updateNotNull(T entity) {
    return mapper.updateByPrimaryKeySelective(entity);
  }

  public List<T> selectByExample(Object example) {
    return mapper.selectByExample(example);
  }

  //TODO 其他...
}
