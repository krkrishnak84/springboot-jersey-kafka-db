package org.radhatechi.spring.config;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.radhatechi.spring.api.CustomerDetailsAPIImpl;
import org.radhatechi.spring.mapper.GenericExceptionMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api")
public class JerseyConfiguration extends ResourceConfig {

    @PostConstruct
    public void init(){
        register(GenericExceptionMapper.class);
        register(CustomerDetailsAPIImpl.class);
    }

}
