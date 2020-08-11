package com.mywebapp.api.webapi.appconfig;

import com.mywebapp.api.webapi.services.UserService;
import com.mywebapp.api.webapi.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
       
}
