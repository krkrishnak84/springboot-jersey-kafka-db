//package org.radhatechi.spring.kafka.consumer;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.annotation.PostConstruct;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.support.Acknowledgment;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//@Slf4j
//@Component
//public class CustomerConsumer {
//
//   // private ExecutorService executorService;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
////    @PostConstruct
////    public void init(){
////        executorService = Executors.newFixedThreadPool(5);
////    }
//    //@KafkaListener(topics = "#{customerTopic}", containerFactory = "customerListerContainerFactory")
//    @KafkaListener(groupId = "customer-0", topics = "customerTopic", containerFactory = "customerListerContainerFactory")
//    public void listen(String message) throws JsonProcessingException {
//
//        try {
//            JsonNode jsonNode = mapper.readTree(message);
//
//            System.out.println(jsonNode);
//
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @Bean
//    public String customerTopic(){
//        return "customer";
//    }
//
//
//}
