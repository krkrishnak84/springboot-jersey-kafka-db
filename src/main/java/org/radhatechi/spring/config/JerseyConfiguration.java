package org.radhatechi.spring.config;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.radhatechi.spring.controller.CustomerController;
import org.radhatechi.spring.mapper.GenericExceptionMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfiguration extends ResourceConfig {

    @PostConstruct
    public void init(){
        register(CustomerController.class);
        register(GenericExceptionMapper.class);
    }

}
