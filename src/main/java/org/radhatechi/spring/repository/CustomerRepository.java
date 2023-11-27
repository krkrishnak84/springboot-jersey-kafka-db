package org.radhatechi.spring.repository;

import org.radhatechi.spring.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
