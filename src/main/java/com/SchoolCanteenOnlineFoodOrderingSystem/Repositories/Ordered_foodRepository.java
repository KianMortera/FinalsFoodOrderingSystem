package com.SchoolCanteenOnlineFoodOrderingSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Ordered_food;

public interface Ordered_foodRepository extends JpaRepository<Ordered_food, Integer>, JpaSpecificationExecutor<Ordered_food>{
    
}


