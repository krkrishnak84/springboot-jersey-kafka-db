package org.radhatechi.spring.service;

import com.google.gson.JsonObject;
import org.radhatechi.spring.dto.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    org.radhatechi.spring.entity.Customer captureCustomer(JsonObject payloadObject );

}
