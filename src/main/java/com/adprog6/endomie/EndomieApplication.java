package com.adprog6.endomie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class EndomieApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndomieApplication.class, args);
    }
}

