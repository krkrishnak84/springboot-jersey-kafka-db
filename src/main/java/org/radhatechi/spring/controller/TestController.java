package org.radhatechi.spring.controller;


import org.radhatechi.spring.database.CustomerDatabase;
import org.radhatechi.spring.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/names")
    public List<String> getAllNames(){
        return Arrays.asList("Radhakrishna","Mohit Karthikeya","Tejasvi","Bindu");
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
       return CustomerDatabase.getAllCustomers();
    }

}
