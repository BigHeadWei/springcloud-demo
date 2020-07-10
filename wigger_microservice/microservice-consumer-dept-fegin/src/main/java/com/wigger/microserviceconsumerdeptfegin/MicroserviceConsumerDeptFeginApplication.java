package com.wigger.microserviceconsumerdeptfegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wigger.microserviceapi"})
@ComponentScan("com.wigger")
public class MicroserviceConsumerDeptFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerDeptFeginApplication.class, args);
    }

}
