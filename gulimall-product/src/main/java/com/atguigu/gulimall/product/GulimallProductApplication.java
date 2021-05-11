package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus：
 *  1.导入mybatis-plus依赖
 *  2.配置
 *      1）配置数据源
 *          导入数据库驱动
 *          在application.yml文件中配置数据源信息
 *      2）配置mybatis-plus
 *          使用@MapperScan，指定mapper文件在哪
 *          在application.yml中指定sql映射文件在哪
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
