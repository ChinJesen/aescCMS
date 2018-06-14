package cn.com.aesc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * @Author: dawn@acdiost.com
 * @Date: 2018-05-08 13:55
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws:
 * @Version: 
 * @Description: 在Application中，以注解的形式设置扫描的basePackage，可以设置多个，dao可在不同路径。
 * 2018-06-14:导入这个org.mybatis.spring.annotation.MapperScan包会报错：tk.mybatis.mapper.MapperException:无法获取实体类***对应的表名!找了好久。坑了一把
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.com.aesc.mapper")
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
  }