package org.radhatechi.spring.util;

import com.google.gson.JsonObject;
import org.radhatechi.spring.entity.Address;
import org.radhatechi.spring.entity.Customer;

public class CustomerUtil {

    public static Customer prepareCustomerObj(JsonObject payloadObject){

        String firstName = payloadObject.get("firstName") != null ? payloadObject.get("firstName").getAsString() : null;
        String lastName = payloadObject.get("lastName") != null ? payloadObject.get("lastName").getAsString() : null;
        String gender = payloadObject.get("gender") != null ? payloadObject.get("gender").getAsString() : null;
        String email = payloadObject.get("email") != null ? payloadObject.get("email").getAsString() : null;
        Long phoneNum = payloadObject.get("phoneNum") != null ? payloadObject.get("phoneNum").getAsLong() : 0;

        JsonObject address = payloadObject.get("address").getAsJsonObject();
        String street = address.get("street") != null ? payloadObject.get("street").getAsString() : null;
        String city = payloadObject.get("city") != null ? payloadObject.get("city").getAsString() : null;
        String state = payloadObject.get("state") != null ? payloadObject.get("state").getAsString() : null;
        Integer zip = payloadObject.get("zip") != null ? payloadObject.get("zip").getAsInt() : 0;

        Address address1 = new Address(street, city,state,zip);

        return new Customer(firstName,lastName,gender,email,address1,phoneNum);
    }

}
