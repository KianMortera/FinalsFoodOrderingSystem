package com.SchoolCanteenOnlineFoodOrderingSystem.Specs;

import org.springframework.data.jpa.domain.Specification;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Food_menu;

public class Food_menuSpecification extends GenericSpecification<Food_menu>{


public static Specification<Food_menu> ID(int ID) {
    return equal("id", ID);
}
public static Specification<Food_menu> Food_id(int Food_id){
    return equal("food id", Food_id);
}
public static Specification<Food_menu> Food_name(String Food_name){
    return equal("food name", Food_name);
}
public static Specification<Food_menu> Price(int Price){
    return equal("price", Price);
}
public static Specification<Food_menu> Food_nutrients(String Food_nutrients){
    return equal("food nutrients", Food_nutrients);
}

}


