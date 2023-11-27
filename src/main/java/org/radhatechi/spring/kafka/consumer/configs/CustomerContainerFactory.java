//package org.radhatechi.spring.kafka.consumer.configs;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.radhatechi.spring.kafka.consumer.event.CustomerkafkaRecordFilterStragey;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ContainerProperties;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class CustomerContainerFactory {
//
//    @Autowired
//    private CustomerkafkaRecordFilterStragey customerkafkaRecordFilterStragey;
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, String> customerListerContainerFactory(){
//
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        //factory.setAutoStartup(true);
//        factory.setConsumerFactory(customerConsumerFactory());
////        factory.setConcurrency(2);
////        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
////        factory.setRecordFilterStrategy(customerkafkaRecordFilterStragey);
//
//        return factory;
//    }
//
//    @Bean
//    public ConsumerFactory<String,String> customerConsumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(customerConsumerConfigs());
//    }
//
//    private Map<String, Object> customerConsumerConfigs() {
//
//        Map<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "customer-0");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//
//        return props;
//    }
//
//
//}
