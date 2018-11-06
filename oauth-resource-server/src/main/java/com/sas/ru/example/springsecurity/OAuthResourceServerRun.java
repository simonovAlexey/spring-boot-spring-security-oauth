package com.sas.ru.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OAuthResourceServerRun extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OAuthResourceServerRun.class, args);
    }

}
