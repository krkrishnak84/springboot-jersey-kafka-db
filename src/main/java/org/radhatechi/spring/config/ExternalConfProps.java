package org.radhatechi.spring.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// TODO delete this class later
@Getter
@Component
@PropertySource("file:${app.home}/external.properties")
public class ExternalConfProps {

    @Value("${boot.strap.address}")
    private String bootStrapAddress;

    @Value("${thread.pool.count}")
    private String threadPoolCount;

    public String getBootStrapAddress() {
        return bootStrapAddress;
    }

    public void setBootStrapAddress(String bootStrapAddress) {
        this.bootStrapAddress = bootStrapAddress;
    }

    public String getThreadPoolCount() {
        return threadPoolCount;
    }

    public void setThreadPoolCount(String threadPoolCount) {
        this.threadPoolCount = threadPoolCount;
    }
}
