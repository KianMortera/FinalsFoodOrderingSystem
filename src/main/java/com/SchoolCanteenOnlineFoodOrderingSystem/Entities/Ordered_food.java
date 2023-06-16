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
@Table(name = "ordered_food")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ordered_food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int Quantity;
    private String Food;
    private String Food_nutrients;
    private String Date;
    private String Status;

    public int getID(){
        return ID;
    }
    public int getQuantity(){
        return Quantity;
    }
    public String getFood(){
        return Food;
    }
    public String getFood_nutrients(){
        return Food_nutrients;
    }
    public String getDate(){
        return Date;
    }
    public String getStatus(){
        return Status;
    }
    
    
}
