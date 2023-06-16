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
@Table(name = "food_menu")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Food_menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Food_name;
    private int Price;
    private String Food_nutrients;

    public int getID(){
        return ID;
    }
    public String getFood_name(){
        return Food_name;
    }
    public int getPrice(){
        return Price;
    }
    public String getFood_nutrients(){
        return Food_nutrients;
    }
    
}
