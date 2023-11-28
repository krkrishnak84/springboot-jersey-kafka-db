package org.radhatechi.spring.kafka.producer;

import org.radhatechi.spring.dto.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetailsProducer {

    private static final String topic = "customer-0";
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String publishMessage(CustomerDetails customerDetails){

        kafkaTemplate.send(topic, customerDetails);

        return "Message is published successfully";
    }

}
