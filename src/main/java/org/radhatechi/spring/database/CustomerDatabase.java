package org.radhatechi.spring.database;

import org.radhatechi.spring.dto.Address;
import org.radhatechi.spring.dto.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

    public static List<Customer> getAllCustomers(){

        Address address = new Address("Cypress manor", "Dr",208, "Tampa","USA",33647);

        return Arrays.asList(new Customer(2001, "Radhakrishna",address,"test@gmail.com",609297),
                new Customer(2003, "Bindu",address,"test1@gmail.com",609297),
                new Customer(2004, "Tejasvi",address,"test2@gmail.com",609297),
                new Customer(2005, "Mohit",address,"test3@gmail.com",609297));

    }



}
