package org.radhatechi.spring.service;

import com.google.gson.JsonObject;
import org.radhatechi.spring.dto.Customer;
import org.radhatechi.spring.entity.CustomerEntity;

import java.util.List;

public interface CustomerDetailsManager {

    List<Customer> getAllCustomers();

    CustomerEntity captureCustomer(JsonObject payloadObject );

}
