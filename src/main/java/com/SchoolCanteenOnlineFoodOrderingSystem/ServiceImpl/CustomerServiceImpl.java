package com.SchoolCanteenOnlineFoodOrderingSystem.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Customers;
import com.SchoolCanteenOnlineFoodOrderingSystem.Repositories.CustomersRepository;
import com.SchoolCanteenOnlineFoodOrderingSystem.Service.CustomersService;

@Service
public class CustomerServiceImpl implements CustomersService{

    @Autowired
    private CustomersRepository customerRepository;

    @Override
    public void registerCustomer(Customers customers) {

        customerRepository.save(customers);

    }
    
}
