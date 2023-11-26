package org.radhatechi.spring.controller;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import lombok.extern.slf4j.Slf4j;
import org.radhatechi.spring.dto.Customer;
import org.radhatechi.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Slf4j
@Path("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GET
    @Produces(APPLICATION_JSON)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

//    @GET()
//    @Path("customers/{customerId}")
//    public List<Customer> getCustomer(@PathVariable long customerId){
//        System.out.println(customerId);
//        return customerService.getAllCustomers().stream()
//                .filter(customer -> customerId == customer.getCustomerId())
//                .collect(Collectors.toList());
//    }


}
