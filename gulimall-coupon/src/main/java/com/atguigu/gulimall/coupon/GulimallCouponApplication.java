package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用nacos作为配置中心，就是把所有配置全部放在nacos上，服务可以动态读取配置信息
 * 1.添加依赖
 * 2.创建bootstrap.properties
 *  spring.application.name=gulimall-coupon
 *  spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3.在nacos配置中心添加配置文件（Data Id），名字必须为gulimall-coupon.properties
 * 4.在gulimall-coupon.properties中添加配置信息
 * 5.在需要读取配置信息的类上加上@RefreshScope，在属性上用@Value("${}")取值
 *
 * 配置中心使用命名空间dev test prod来隔离不同环境的配置，也可以不同微服务用不同命名空间进行隔离
 *  需要在bootstrap.properties中选择命名空间
 *      spring.cloud.nacos.config.namespace=31ecea0e-b371-47f5-922f-29b465dc9563
 *
 * 同一个命名空间内的若干个配置集可以进行分组，在bootstrap.properties中选择分组
 *      spring.cloud.nacos.config.group=DEFAULT_GROUP
 *
 * 用namespace区分服务，用group区分开发、测试、生产环境
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
