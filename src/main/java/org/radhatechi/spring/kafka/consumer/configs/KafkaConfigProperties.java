package org.radhatechi.spring.kafka.consumer.configs;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class KafkaConfigProperties {

    @Value("${spring.kafka.bootstrap.address}")
    private String bootstrapAddress;

    @Value("${spring.kafka.group.id}")
    private String groupId;

    @Value("${spring.kafka.consumer.threads}")
    private Integer consumerThreadsCount;

    @Value("${spring.kafka.consumer.topic}")
    private String topic;


    public void setBootstrapAddress(String bootstrapAddress) {
        this.bootstrapAddress = bootstrapAddress;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setConsumerThreadsCount(Integer consumerThreadsCount) {
        this.consumerThreadsCount = consumerThreadsCount;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
