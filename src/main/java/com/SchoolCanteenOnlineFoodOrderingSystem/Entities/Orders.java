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

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Food;
    private int Quantity;
    private int Price;
    private String Food_nutrients;

    public int getID(){
        return ID;
    }
    public String getFood(){
        return Food;
    }
    public int getQuantity(){
        return Quantity;
    }
    public int getPrice(){
        return Price;
    }
    public String getFood_nutrients(){
        return Food_nutrients;
    }


    
}
