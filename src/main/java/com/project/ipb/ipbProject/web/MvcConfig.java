package com.project.ipb.ipbProject.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/clientSubmit").setViewName("clientSubmit");
        registry.addViewController("/carSubmit").setViewName("carSubmit");
        registry.addViewController("/helloAdmin").setViewName("helloAdmin");
        registry.addViewController("/applicationSubmit").setViewName("applicationSubmit");
    }
}
