package org.radhatechi.spring.api;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import lombok.extern.slf4j.Slf4j;
import org.radhatechi.spring.dto.Customer;
import org.radhatechi.spring.service.CustomerDetailsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

// TODO delete later
@Component
@Slf4j
@Path("/customers")
public class CustomerController {

    @Autowired
    private CustomerDetailsManager customerDetailsManager;

    @GET
    @Produces(APPLICATION_JSON)
    public List<Customer> getAllCustomers(){
        return customerDetailsManager.getAllCustomers();
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
