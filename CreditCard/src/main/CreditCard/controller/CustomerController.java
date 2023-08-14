package com.Project.CreditCard.controller;

import com.Project.CreditCard.entity.Customer;
import com.Project.CreditCard.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService _customerService)
    {
        this.customerService=_customerService;
    }

    @GetMapping("/gender/{gender}")
    public ResponseEntity<List<Customer>> getCustomersByGender(@PathVariable String gender)
    {
        List<Customer> customers = customerService.getCustomerByGender(gender);
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/profession/{profession}")
    public ResponseEntity<List<Customer>> getCustomersByProfession(@PathVariable String profession)
    {
        List<Customer> customers=customerService.getCustomerByProfession(profession);
        return ResponseEntity.ok(customers);
    }





}
