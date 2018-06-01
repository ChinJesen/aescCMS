/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: ResourcesMapper
 * Author:   dawn@acdiost.com
 * Date:     2018-06-01 16:39
 * Description: 资源映射类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.mapper;

import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.utils.MyMapper;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈资源映射类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-01
 * @since 1.0.0
 */
public interface ResourcesMapper extends MyMapper<Resources> {
   List<Resources> queryAll();

   List<Resources> loadUserResources(Map<String,Object> map);

   List<Resources> queryResourcesListWithSelected(Integer rid);
}
