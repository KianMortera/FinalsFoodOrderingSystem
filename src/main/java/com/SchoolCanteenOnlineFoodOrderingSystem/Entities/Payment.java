package com.SchoolCanteenOnlineFoodOrderingSystem.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Ordered_food")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Customer_name;
    private int Reference_number;
    private int Cellphone_number;

    public int getID(){
        return ID;
    }
    public String getCustomer_name(){
        return Customer_name;
    }
    public int getReference_number(){
        return Reference_number;
    }
    public int getCellphone_number(){
        return Cellphone_number;
    }

    
}
