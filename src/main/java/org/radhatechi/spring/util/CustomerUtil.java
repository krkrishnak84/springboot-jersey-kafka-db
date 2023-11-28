package org.radhatechi.spring.util;

import com.google.gson.JsonObject;
import org.radhatechi.spring.entity.AddressEntity;
import org.radhatechi.spring.entity.CustomerEntity;

public class CustomerUtil {

    public static CustomerEntity prepareCustomerObj(JsonObject payloadObject){

        String firstName = payloadObject.get("firstName") != null ? payloadObject.get("firstName").getAsString() : null;
        String lastName = payloadObject.get("lastName") != null ? payloadObject.get("lastName").getAsString() : null;
        String gender = payloadObject.get("gender") != null ? payloadObject.get("gender").getAsString() : null;
        String email = payloadObject.get("email") != null ? payloadObject.get("email").getAsString() : null;
        Long phoneNum = payloadObject.get("phoneNum") != null ? payloadObject.get("phoneNum").getAsLong() : 0;

        JsonObject address = payloadObject.get("address").getAsJsonObject();
        String street = address.get("street") != null ? address.get("street").getAsString() : null;
        String city = address.get("city") != null ? address.get("city").getAsString() : null;
        String state = address.get("state") != null ? address.get("state").getAsString() : null;
        Integer zip = address.get("zip") != null ? address.get("zip").getAsInt() : 0;

        AddressEntity addressEntity1 = new AddressEntity(street, city,state,zip);

        return new CustomerEntity(firstName,lastName,gender,email, addressEntity1,phoneNum);
    }

}
