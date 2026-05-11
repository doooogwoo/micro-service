package com.ecommerce.oder.clients;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    @Bean
    @LoadBalanced
    //@LoadBalanced 的作用
    //把 service name 轉成 instance
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

}
