package com.SchoolCanteenOnlineFoodOrderingSystem.Specs;

import org.springframework.data.jpa.domain.Specification;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Customers;


public class CustomerSpecification extends GenericSpecification<Customers>{

    public static Specification<Customers> ID(int ID) {
        return equal("id", ID);
    }
    public static Specification<Customers> Full_name(String Full_name) {
        return equal("fullname", Full_name);
}
    public static Specification<Customers> Customer_id(int Customer_id){
        return equal("Customer id", Customer_id);
    }
    public static Specification<Customers> Username(String Username){
        return equal("Username", Username);
    }
    public static Specification<Customers> Password(int Password){
        return equal("Password", Password);
    }
    public static Specification<Customers> Gcash_name(String Gcash_name){
        return equal("Gcash name", Gcash_name);
    }
    public static Specification<Customers> Gcash_number(int Gcash_number){
        return equal("Gcash number", Gcash_number);
}
}