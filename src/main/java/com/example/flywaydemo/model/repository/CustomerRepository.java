package com.example.flywaydemo.model.repository;

import com.example.flywaydemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByName(String name);

}
