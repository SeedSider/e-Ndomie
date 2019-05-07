package com.adprog6.endomie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@RestController
public class EndomieApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndomieApplication.class, args);
    }
}

