package org.radhatechi.spring.service;

import org.radhatechi.spring.database.CustomerDatabase;
import org.radhatechi.spring.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public List<Customer> getAllCustomers() {
        return CustomerDatabase.getAllCustomers()
                .stream()
                .sorted(Comparator.comparing(Customer::getCustomerId))
                .collect(Collectors.toList());
    }
}
