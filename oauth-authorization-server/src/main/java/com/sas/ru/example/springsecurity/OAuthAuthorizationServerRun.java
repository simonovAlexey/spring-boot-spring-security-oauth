package com.sas.ru.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OAuthAuthorizationServerRun extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OAuthAuthorizationServerRun.class, args);
    }
}
