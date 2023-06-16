package com.SchoolCanteenOnlineFoodOrderingSystem.Specs;

import org.springframework.data.jpa.domain.Specification;

import com.SchoolCanteenOnlineFoodOrderingSystem.Entities.Payment;


public class PaymentSpecification extends GenericSpecification<Payment>{

    public static Specification<Payment> ID(int ID) {
        return equal("id", ID);
    }
    public static Specification<Payment> Payment_id(int Payment_id) {
        return equal("payment id", Payment_id);
    }
    public static Specification<Payment> Customer_name(String Customer_name) {
        return equal("customer name", Customer_name);
    }
    public static Specification<Payment> Reference_number(int Reference_number) {
        return equal("reference number", Reference_number);
    }
    public static Specification<Payment> Cellphone_number(int Cellphone_number) {
        return equal("cellphone number", Cellphone_number);
    }

}
