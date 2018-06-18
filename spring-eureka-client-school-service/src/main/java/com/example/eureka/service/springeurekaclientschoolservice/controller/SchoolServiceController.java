package com.example.eureka.service.springeurekaclientschoolservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class SchoolServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getSchoolDetails/{schoolname}")
    public String getStudents(@PathVariable String schoolname) {
        System.out.println("Getting School details for " + schoolname);

        String response = restTemplate.exchange("http://student-service/getStudentDetailsForSchool/{schoolname}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
                }, schoolname).getBody();

        System.out.println("Response Received as " + response);

        return "School Name -  " + schoolname + " \n Student Details " + response;
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

