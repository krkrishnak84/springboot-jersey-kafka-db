package org.radhatechi.spring.kafka.consumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.radhatechi.spring.entity.Customer;
import org.radhatechi.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CustomerCaptureConsumer {


    @Autowired
    private CustomerService customerService;
    private Gson gson = new GsonBuilder().setLenient().create();

    @KafkaListener(topics = "#{topicForCustomer}", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void listen(@Payload  String message, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition, @Header(KafkaHeaders.OFFSET) int offset, Acknowledgment acknowledgment){

        System.out.println(partition);
        System.out.println(offset);
        System.out.println(message);
        try{
            JsonObject eventObject = gson.fromJson(message, JsonObject.class);
            JsonObject payloadObject = eventObject.get("payload").getAsJsonObject();
            Customer customer = customerService.captureCustomer(payloadObject);

            System.out.println("captured customer :: "+ customer);

        }catch (Exception e){
            System.err.println("Exception in Consumer "+e.getMessage());
        }finally {
            acknowledgment.acknowledge();
        }
    }


    /* Basic kafka listener code
    @KafkaListener(topics = "customer-0", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void listen(String message){
       System.out.println(message);
    }*/
}

