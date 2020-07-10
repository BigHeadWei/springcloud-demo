package com.wigger.microserviceconsumerdept80.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule myRule()
    {
        return new RandomRule();// Ribbon默认是轮询，我自定义为随机
        //return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

        /**
         * 一般可以返回自定义的负载均衡机智，
         */
//        return new RandomRule_ZY();// 我自定义为每台机器5次
    }
}
