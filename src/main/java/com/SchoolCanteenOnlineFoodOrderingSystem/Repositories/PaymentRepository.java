package com.SchoolCanteenOnlineFoodOrderingSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>, JpaSpecificationExecutor<Payment>{
    
}

    

