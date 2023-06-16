package com.SchoolCanteenOnlineFoodOrderingSystem.Specs;

import org.springframework.data.jpa.domain.Specification;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Ordered_food;

public class Ordered_foodSpecification extends GenericSpecification<Ordered_food>{


    public static Specification<Ordered_foodSpecification> ID(int ID){
        return equal("id", ID);
    }
    public static Specification<Ordered_foodSpecification> Quantity(int Quantity){
        return equal("quantity", Quantity);
    }
    public static Specification<Ordered_foodSpecification> Order_id(int Order_id){
        return equal("order id", Order_id);
    }
    public static Specification<Ordered_foodSpecification> Food(String Food){
        return equal("food", Food);
    }
    public static Specification<Ordered_foodSpecification> Food_nutrients(String Food_nutrients){
        return equal("food nutrients", Food_nutrients);
    }
    public static Specification<Ordered_foodSpecification> Date(String Date){
        return equal("date",Date);
    }
    public static Specification<Ordered_foodSpecification> Status(String Status){
        return equal("status", Status);





    
}
}
