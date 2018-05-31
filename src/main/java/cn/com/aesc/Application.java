package cn.com.aesc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * @Author: dawn@acdiost.com
 * @Date: 2018-05-08 13:55
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws:
 * @Version: 
 * @Description: 
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.com.aesc.mapper")
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
  }