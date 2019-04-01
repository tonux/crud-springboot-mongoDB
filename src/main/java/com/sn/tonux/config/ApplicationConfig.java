package com.sn.tonux.config;

import com.sn.tonux.service.UserService;
import com.sn.tonux.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sn.tonux")
public class ApplicationConfig {

    @Bean(name="userService")
    public UserService getTopoService() {
        return new UserServiceImpl();
    }

}
