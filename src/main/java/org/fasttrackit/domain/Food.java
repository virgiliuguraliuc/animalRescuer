package org.fasttrackit.domain;

import java.time.LocalDate;

public class Food {
   private String FoodName;
   private double FoodPrice;
   private double FoodQuantity;
   private LocalDate expiryDate;
   private LocalDate createdDate;
   private boolean inStock;


    public Food(String foodName) {
        this.FoodName = foodName;
    }

    //getter
    public String getFoodName() {
        return FoodName;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public double getFoodQuantity() {
        return FoodQuantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public boolean isInStock() {
        return inStock;
    }

   //setter
    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        FoodPrice = foodPrice;
    }

    public void setFoodQuantity(double foodQuantity) {
        FoodQuantity = foodQuantity;
    }

    public void setExpiryDate(int year, int month, int day) {
        this.expiryDate = LocalDate.of(year, month, day);
    }

    public void setCreatedDate(int year, int month, int day) {
        this.createdDate = LocalDate.of(year, month, day);
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }



}
