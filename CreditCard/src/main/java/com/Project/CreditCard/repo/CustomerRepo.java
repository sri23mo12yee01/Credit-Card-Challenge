package com.Project.CreditCard.repo;


import com.Project.CreditCard.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepo  extends MongoRepository<Customer, String> {

    public Customer findByCustomerId(String id);

    @Query("{'name':'?0'}")
    List<Customer> findByName(String name);
    @Query("{'country':'?0'}")
    List<Customer> findByCountry(String country);

    //Page<Customer> findByGreaterThan(double salary, Pageable pageable);
    //Page<Customer> findAll(Pageable pageable);





}
