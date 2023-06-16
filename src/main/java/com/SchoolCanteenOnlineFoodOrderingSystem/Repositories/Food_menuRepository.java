package com.SchoolCanteenOnlineFoodOrderingSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Food_menu;

public interface Food_menuRepository extends JpaRepository<Food_menu, Integer>, JpaSpecificationExecutor<Food_menu>{
    
}
