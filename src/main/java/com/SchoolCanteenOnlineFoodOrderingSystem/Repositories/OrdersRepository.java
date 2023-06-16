package com.SchoolCanteenOnlineFoodOrderingSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>, JpaSpecificationExecutor<Orders>{


    
}
