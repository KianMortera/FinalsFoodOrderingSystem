package com.SchoolCanteenOnlineFoodOrderingSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Customers;

@Repository
public interface CustomersRepository extends JpaRepository <Customers, String>{

    
    
}
