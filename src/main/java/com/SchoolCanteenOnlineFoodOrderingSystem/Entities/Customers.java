package com.SchoolCanteenOnlineFoodOrderingSystem.Entities;
import java.math.BigInteger;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "customers")
@Data

public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String fullName;
    private String username;
    private String password;
    private String gcash_name;
    private BigInteger gcash_number;
    
    public String getName(){
        return fullName;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }




}
