package com.example.eureka.service.springeurekaclientstudent2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaClientStudent2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientStudent2ServiceApplication.class, args);
    }
}
