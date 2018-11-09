package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProvideUser1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProvideUser1Application.class, args);
    }
}
