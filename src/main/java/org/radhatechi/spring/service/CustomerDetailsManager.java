package org.radhatechi.spring.service;

import com.google.gson.JsonObject;
import org.radhatechi.spring.entity.CustomerEntity;

public interface CustomerDetailsManager {

    CustomerEntity captureCustomer(JsonObject payloadObject );

}
