package org.radhatechi.spring.config;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// TODO delete this class later
@Getter
@Component
@PropertySource("file:C:\\global.properties")
@ConfigurationProperties(prefix = "db")
public class ExternalConfigProperties {

    private int threadPool;
    private String email;

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
