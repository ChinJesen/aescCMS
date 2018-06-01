/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: ShiroConfig
 * Author:   dawn@acdiost.com
 * Date:     2018-05-31 12:13
 * Description: shiro的配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.service.resources.ResourcesService;
import cn.com.aesc.shiro.CustomizeRealm;
import com.github.pagehelper.util.StringUtil;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈shiro的配置〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-31
 * @since 1.0.0
 */
@Configuration
public class ShiroConfig {

  @Autowired(required = false)
  private ResourcesService resourcesService;

  @Value("${spring.redis.host}")
  private String host;
  @Value("${spring.redis.port}")
  private int port;
  @Value("${spring.redis.timeout}")
  private int timeout;
  @Value("${spring.redis.password}")
  private String password;


  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 14:26
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 重要的生命周期配置
   */
  @Bean
  static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor(){
    return new LifecycleBeanPostProcessor();
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-31 13:37
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description:为了在thymeleaf里使用shiro的标签
   */
  @Bean
  ShiroDialect shiroDialect() {
    return new ShiroDialect();
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 9:12
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: shiro拦截器配置
   */
  @Bean
  ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
    // 必须设置的securityManager
    shiroFilterFactoryBean.setSecurityManager(securityManager);
    // 设置登录界面链接
    shiroFilterFactoryBean.setLoginUrl("/login");
    // 设置登录成功后跳转的链接
    shiroFilterFactoryBean.setSuccessUrl("manageHtml/main");
    // 设置未授权的错误链接
    shiroFilterFactoryBean.setUnauthorizedUrl("/404");
    // 定义过滤器链映射 为匿名，所有人可访问静态资源 从上向下顺序执行，一般将 /**放在最为下边
    // authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问
    Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
    filterChainDefinitionMap.put("/logout", "logout");
    filterChainDefinitionMap.put("/css/**", "anon");
    filterChainDefinitionMap.put("/js/**", "anon");
    filterChainDefinitionMap.put("/img/**", "anon");
    filterChainDefinitionMap.put("/font-awesome/**", "anon");
    filterChainDefinitionMap.put("/xenon/**", "anon");
    filterChainDefinitionMap.put("/layer/**", "anon");
    filterChainDefinitionMap.put("/ico/**", "anon");
    filterChainDefinitionMap.put("/bootstrap/**", "anon");
    // 自定义加载权限资源关系
    List<Resources> resourcesList = resourcesService.queryAll();
    for (Resources resources : resourcesList){
      if (StringUtil.isNotEmpty(resources.getRole_resources())){
        String permission = "perms[" + resources.getResources_url() + "]";
        filterChainDefinitionMap.put(resources.getResources_url(),permission);
      }
    }
    filterChainDefinitionMap.put("/**", "authc");


    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
    return shiroFilterFactoryBean;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 16:00
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description:
   */
  @Bean
  SecurityManager securityManager() {
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    // 设置自定义的realm
    securityManager.setRealm(customizeRealm());
    // 用redis实现自定义缓存
    securityManager.setCacheManager(cacheManager());
    // 用redis来管理session
    securityManager.setSessionManager(sessionManager());
    return securityManager();
  }

  
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * 
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 15:55
   * @Param: 
   * @Return: 
   * @See: 
   * @Throws: 
   * @Version: 
   * @Description: 
   */
  
  RedisCacheManager cacheManager(){
    RedisCacheManager redisCacheManager = new RedisCacheManager();
    redisCacheManager.setRedisManager(redisManager());
    return redisCacheManager;
  }
  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 9:36
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 自定义的realm注入
   */
  @Bean
  CustomizeRealm customizeRealm() {
    CustomizeRealm customizeRealm = new CustomizeRealm();
    customizeRealm.setCredentialsMatcher(hashedCredentialsMatcher());
    return customizeRealm;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 9:47
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 凭证匹配器（密码） 由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了
   * 所以我们需要修改下doGetAuthenticationInfo中的代码;
   */
  @Bean
  HashedCredentialsMatcher hashedCredentialsMatcher() {
    HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
    hashedCredentialsMatcher.setHashAlgorithmName("SHA-256");
    hashedCredentialsMatcher.setHashIterations(6);
    return hashedCredentialsMatcher();
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 10:34
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 开启aop注解使用的代理 需要开启支持
   */
  @Bean
  AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
    AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
    authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
    return authorizationAttributeSourceAdvisor;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 14:15
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: session的管理 通过redis
   */
  @Bean
  DefaultWebSessionManager sessionManager() {
    DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
    sessionManager.setSessionDAO(redisSessionDAO());
    return sessionManager;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 14:19
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 使用shiro-redis开源插件
   */
  @Bean
  RedisSessionDAO redisSessionDAO() {
    RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
    redisSessionDAO.setRedisManager(redisManager());
    return redisSessionDAO;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-01 14:21
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 配置redis
   */
  RedisManager redisManager() {
    RedisManager redisManager = new RedisManager();
    redisManager.setHost(host);
    redisManager.setPort(port);
    redisManager.setExpire(1800);
    redisManager.setTimeout(timeout);
    return redisManager;
  }
}
