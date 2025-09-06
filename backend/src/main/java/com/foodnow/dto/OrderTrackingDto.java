package com.foodnow.dto;

//import com.foodnow.model.OrderStatus;


public class OrderTrackingDto extends OrderDto { 
    
    private String restaurantLocationPin;

    
    // Getters and Setters
    public String getRestaurantLocationPin() {
        return restaurantLocationPin;
    }

    public void setRestaurantLocationPin(String restaurantLocationPin) {
        this.restaurantLocationPin = restaurantLocationPin;
    }

    
}
