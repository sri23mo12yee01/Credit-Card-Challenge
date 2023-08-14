package com.Project.CreditCard.service;

import com.Project.CreditCard.entity.Customer;
import com.Project.CreditCard.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    private final CustomerRepo customerRepo;
    @Autowired
    public CustomerService(CustomerRepo _customerRepo){
        this.customerRepo=_customerRepo;
    }

    public List<Customer> getCustomerByGender(String _gender)
    {
        return customerRepo.findByGender(_gender);
    }

    public List<Customer> getCustomerByProfession(String _profession)
    {
        return customerRepo.findByProfession(_profession);
    }


}
