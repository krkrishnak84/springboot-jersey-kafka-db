package org.radhatechi.spring.service;

import com.google.gson.JsonObject;
import org.radhatechi.spring.dal.jpa.service.CustomerDALService;
import org.radhatechi.spring.database.CustomerDatabase;
import org.radhatechi.spring.dto.Customer;
import org.radhatechi.spring.entity.CustomerEntity;
import org.radhatechi.spring.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerDetailsManagerImpl implements CustomerDetailsManager {


    @Autowired
    private CustomerDALService customerDALService;


    @Override
    public List<Customer> getAllCustomers() {
        return CustomerDatabase.getAllCustomers()
                .stream()
                .sorted(Comparator.comparing(Customer::getCustomerId))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerEntity captureCustomer(JsonObject payloadObject ) {

        CustomerEntity customerEntity = CustomerUtil.prepareCustomerObj(payloadObject);
        // save customer data in to entity
        return customerDALService.save(customerEntity);
       }
}

