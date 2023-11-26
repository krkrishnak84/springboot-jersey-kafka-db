package org.radhatechi.spring.controller;


import org.radhatechi.spring.database.CustomerDatabase;
import org.radhatechi.spring.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @GetMapping("/names")
    public List<String> getAllNames(){
        return Arrays.asList("Radhakrishna","Mohit Karthikeya","Tejasvi","Bindu");
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){

        //CustomerDatabase.getAllCustomers().stream().sorted((o1,o2) -> o1.getCustomerName().compareTo(o2.getCustomerName()))
        //               .collect(Collectors.toList())

        // sort by customer id
        //CustomerDatabase.getAllCustomers().stream().sorted(Comparator.comparing(Customer::getCustomerId))
        //.collect(Collectors.toList())

        // sort by customer name
       return CustomerDatabase.getAllCustomers().stream().sorted(Comparator.comparing(Customer::getCustomerName))
               .collect(Collectors.toList());

    }

    @GetMapping("/customers/group")
    public Map<Long, List<Customer>> groupByCustomers(){
        return CustomerDatabase.getAllCustomers().stream()
                .collect(Collectors.groupingBy(Customer::getCustomerId));
    }

    @GetMapping("customers/{customerId}")
    public List<Customer> getCustomer(@PathVariable long customerId){

        return CustomerDatabase.getAllCustomers().stream()
                .filter(customer -> customerId == customer.getCustomerId())
                .collect(Collectors.toList());
    }



}
