/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: ShiroService
 * Author:   dawn@acdiost.com
 * Date:     2018-06-01 16:00
 * Description: shiro服务类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.shiro;

import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.service.resources.ResourcesService;
import com.github.pagehelper.util.StringUtil;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈shiro服务类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-01
 * @since 1.0.0
 */
@Service
public class ShiroService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ShiroService.class);
  @Autowired
  private ShiroFilterFactoryBean filterFactoryBean;

  @Autowired
  private ResourcesService resourcesService;

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 16:10
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 初始化权限
   */
  Map<String,String> loadFilterChainDefinitions(){
    Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
    filterChainDefinitionMap.put("/logout", "logout");
    filterChainDefinitionMap.put("/css/**", "anon");
    filterChainDefinitionMap.put("/js/**", "anon");
    filterChainDefinitionMap.put("/img/**", "anon");
    filterChainDefinitionMap.put("/font-awesome/**", "anon");
    filterChainDefinitionMap.put("/xenon/**", "anon");
    filterChainDefinitionMap.put("/layer/**", "anon");
    filterChainDefinitionMap.put("/ico/**", "anon");
    filterChainDefinitionMap.put("/bootstrap/**", "anon");
    List<Resources> resourcesList = resourcesService.queryAll();
    for (Resources resources : resourcesList){
      if (StringUtil.isNotEmpty(resources.getRole_resources())){
        String permission = "perms[" + resources.getResources_url() + "]";
        filterChainDefinitionMap.put(resources.getResources_url(),permission);
      }
    }
    filterChainDefinitionMap.put("/**", "authc");

  return filterChainDefinitionMap;
  }


  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 16:24
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:重新加载权限
   */
  public void updatePermission(){
    synchronized (filterFactoryBean){
      AbstractShiroFilter shiroFilter = null;
      try {
        shiroFilter = (AbstractShiroFilter)filterFactoryBean.getObject();
      } catch (Exception e) {
        throw new RuntimeException("get ShiroFilter from shiroFilterFactoryBean error!");
      }
      PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter.getFilterChainResolver();
      DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver.getFilterChainManager();
      // 清空老的权限控制
      manager.getFilterChains().clear();
      filterFactoryBean.getFilterChainDefinitionMap().clear();
      filterFactoryBean.setFilterChainDefinitionMap(loadFilterChainDefinitions());

      // 重新构建生成
      Map<String,String> chains = filterFactoryBean.getFilterChainDefinitionMap();
      for (Map.Entry<String,String> entry : chains.entrySet()){
        String url = entry.getKey();
        String chainDefinition = entry.getValue().trim().replace("","");
        manager.createChain(url,chainDefinition);
      }

      LOGGER.info("更新权限成功！");
    }
  }
}
