package com.sas.ru.example.springsecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan({"com.sas.ru.example.springsecurity.controller"})
public class SpringMVCWebConfig implements WebMvcConfigurer {
    //
}
