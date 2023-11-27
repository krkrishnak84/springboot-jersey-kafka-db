package org.radhatechi.spring.kafka.consumer.event;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.adapter.RecordFilterStrategy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerkafkaRecordFilterStragey implements RecordFilterStrategy<String, String> {
    @Override
    public boolean filter(ConsumerRecord<String, String> consumerRecord) {
        return true;
    }
}
