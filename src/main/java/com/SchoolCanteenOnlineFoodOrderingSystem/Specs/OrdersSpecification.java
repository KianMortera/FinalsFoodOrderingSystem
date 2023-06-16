package com.SchoolCanteenOnlineFoodOrderingSystem.Specs;

import org.springframework.data.jpa.domain.Specification;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Orders;


public class OrdersSpecification extends GenericSpecification<Orders>{

    public static Specification<OrdersSpecification> ID(int ID){
        return equal("id", ID);
    }
    public static Specification<OrdersSpecification> Customer_id(int Customer_id){
        return equal("customer id", Customer_id);
    }
    public static Specification<OrdersSpecification> Food(String Food){
        return equal("food", Food);
    }
    public static Specification<OrdersSpecification> Quantity(int Quantity){
        return equal("quantity", Quantity);
    }
    public static Specification<OrdersSpecification> Price(int Price){
        return equal("price", Price);
    }
    public static Specification<OrdersSpecification> Food_nutrients(String Food_nutrients){
        return equal("Food nutrients", Food_nutrients);
}
}