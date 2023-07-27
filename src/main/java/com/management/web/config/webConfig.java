package com.management.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://savable.net",
                        "https://savable.net",
                        "http://172.16.101.189:3000/",
                        "http://savable-content.s3-website.ap-northeast-2.amazonaws.com/")
                .allowedMethods("*");
    }
}