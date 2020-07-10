package com.wigger.microservicezuulgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableZuulProxy // 使之成为网关
public class MicroserviceZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZuulGateway9527Application.class, args);
    }

}
