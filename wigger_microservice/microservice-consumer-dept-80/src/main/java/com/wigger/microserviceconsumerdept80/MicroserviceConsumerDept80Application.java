package com.wigger.microserviceconsumerdept80;

import com.wigger.microserviceconsumerdept80.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICE-DEPT")
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICE-DEPT",configuration=RibbonConfiguration.class)
public class MicroserviceConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerDept80Application.class, args);
    }

}
