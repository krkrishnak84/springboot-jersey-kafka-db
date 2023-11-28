package org.radhatechi.spring.api;

import org.radhatechi.spring.dal.jpa.service.CustomerDALService;
import org.radhatechi.spring.dto.AddressInfo;
import org.radhatechi.spring.dto.CustomerDetails;
import org.radhatechi.spring.dto.CustomerInfo;
import org.radhatechi.spring.entity.CustomerEntity;
import org.radhatechi.spring.kafka.producer.CustomerDetailsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDetailsAPIImpl implements CustomerDetailsAPI{


    @Autowired
    private CustomerDetailsProducer customerDetailsProducer;

    @Autowired
    private CustomerDALService customerDALService;

    public CustomerDetailsAPIImpl() {
    }

    @Override
    public List<CustomerInfo> getAllCustomer() {

        List<CustomerInfo> customerInfoList = new ArrayList<>();
        List<CustomerEntity> allCustomers = customerDALService.findAllCustomers();
        allCustomers.forEach(customerEntity -> {

            //TODO change to builder pattern
            AddressInfo addressInfo = new AddressInfo(customerEntity.getAddressEntity().getStreet(),
                    customerEntity.getAddressEntity().getCity(),
                    customerEntity.getAddressEntity().getState(),
                    customerEntity.getAddressEntity().getZipCode());

            CustomerInfo customerInfo = new CustomerInfo(customerEntity.getCustomerId(),
                    customerEntity.getFirstName(),
                    customerEntity.getLastName(),
                    customerEntity.getGender(),
                    customerEntity.getEmail(),
                    customerEntity.getPhoneNum(),
                    addressInfo
            );
            customerInfoList.add(customerInfo);
        });
        return customerInfoList;
    }

    @Override
    public CustomerInfo getCustomer(Long customerId) {

        CustomerEntity customerEntity = customerDALService.findByCustomerId(customerId);

        //TODO change to builder pattern
        AddressInfo addressInfo = new AddressInfo(customerEntity.getAddressEntity().getStreet(),
                customerEntity.getAddressEntity().getCity(),
                customerEntity.getAddressEntity().getState(),
                customerEntity.getAddressEntity().getZipCode());

        return new CustomerInfo(customerEntity.getCustomerId(),
                customerEntity.getFirstName(),
                customerEntity.getLastName(),
                customerEntity.getGender(),
                customerEntity.getEmail(),
                customerEntity.getPhoneNum(),
                addressInfo);
    }

    @Override
    public String addCustomer(CustomerDetails customerDetails) {
        // publish message to kafka topic
        return customerDetailsProducer.publishMessage(customerDetails);
    }
}
