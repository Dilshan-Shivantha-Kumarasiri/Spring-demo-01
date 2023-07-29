package com.example.demo02.config;


import com.example.demo02.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration //configuration class (source for BEAN definition)
@EnableWebMvc //@EnableWebMvc is an annotation used to enable Spring Web MVC in a Spring application,
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {

    public WebAppConfig(){
        System.out.println("hello Spring mvc");
    }

}
