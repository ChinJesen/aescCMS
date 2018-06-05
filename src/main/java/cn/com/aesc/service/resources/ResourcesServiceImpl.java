/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: ResourcesServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-06-01 16:34
 * Description: 资源分页查询
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.resources;

import cn.com.aesc.mapper.ResourcesMapper;
import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.service.impl.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈资源分页查询〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-01
 * @since 1.0.0
 */
@Service("resourcesService")
public class ResourcesServiceImpl extends BaseService<Resources> implements ResourcesService {


  @Resource
  private ResourcesMapper resourcesMapper;

  @Override
  public PageInfo<Resources> selectByPage(Resources resources, int start, int length) {
    int page = start/length+1;
    Example example = new Example(Resources.class);
    // 分页查询
    PageHelper.startPage(page,length);
    List<Resources> userList = selectByExample(example);
    return new PageInfo<>(userList);
  }

  @Override
  public List<Resources> queryAll() {
    return resourcesMapper.queryAll();
  }

  @Override
  public List<Resources> loadUserResources(Map<String, Object> map) {
    return resourcesMapper.loadUserResources(map);
  }

  @Override
  public List<Resources> queryResourcesListWithSelected(Integer rid) {
    return resourcesMapper.queryResourcesListWithSelected(rid);
  }
}
