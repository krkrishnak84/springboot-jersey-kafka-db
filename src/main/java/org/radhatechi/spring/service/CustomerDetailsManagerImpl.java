package org.radhatechi.spring.service;

import com.google.gson.JsonObject;
import org.radhatechi.spring.dal.jpa.service.CustomerDALService;
import org.radhatechi.spring.entity.CustomerEntity;
import org.radhatechi.spring.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerDetailsManagerImpl implements CustomerDetailsManager {


    @Autowired
    private CustomerDALService customerDALService;

    @Override
    public CustomerEntity captureCustomer(JsonObject payloadObject ) {

        CustomerEntity customerEntity = CustomerUtil.prepareCustomerObj(payloadObject);
        // save customer data in to entity
        return customerDALService.save(customerEntity);
       }
}

