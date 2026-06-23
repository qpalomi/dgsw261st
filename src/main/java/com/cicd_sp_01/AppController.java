package com.cicd_sp_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String Hello() {
        int test=0;
        return "Hello Spring Boot CICD 01";
    }

}