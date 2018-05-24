/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: DruidConfig
 * Author:   dawn@acdiost.com
 * Date:     2018-05-24 14:25
 * Description: druid配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈druid配置〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-24
 * @since 1.0.0
 */
@Configuration
public class DruidConfig {

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-24 14:30
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 注入阿里数据库连接池的账户密码
   */
  @Bean
  public ServletRegistrationBean druidServlet(){
    // 设置网页访问url
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    servletRegistrationBean.addInitParameter("loginUsername","admin");
    servletRegistrationBean.addInitParameter("loginPassword","admin");
    return servletRegistrationBean;
  }

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   * @Author: dawn@acdiost.com
   * @Date: 2018-05-24 14:33
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 文件过滤器注册注入
   */
  @Bean
  public FilterRegistrationBean filterRegistrationBean(){
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
    return filterRegistrationBean;
  }
}
