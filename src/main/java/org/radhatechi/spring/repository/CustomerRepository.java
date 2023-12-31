package org.radhatechi.spring.repository;

import org.radhatechi.spring.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
