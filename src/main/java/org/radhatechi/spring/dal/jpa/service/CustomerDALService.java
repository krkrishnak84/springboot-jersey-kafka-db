package org.radhatechi.spring.dal.jpa.service;


import org.radhatechi.spring.entity.CustomerEntity;
import org.radhatechi.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerDALService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEntity save(CustomerEntity customerEntity){
        return customerRepository.save(customerEntity);
    }

    public List<CustomerEntity>  findAllCustomers(){
        List<CustomerEntity> list = new ArrayList<>();
        Iterable<CustomerEntity> customers = customerRepository.findAll();
        customers.iterator().forEachRemaining(list::add);
        return list;
    }

    public CustomerEntity findByCustomerId(Long customerId){
       Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        return customerEntity.orElse(null);
    }


}
