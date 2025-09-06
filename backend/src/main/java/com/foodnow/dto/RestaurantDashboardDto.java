package com.foodnow.dto;

import java.util.List;

public class RestaurantDashboardDto {
    private RestaurantDto restaurantProfile;
    private List<OrderDto> orders;
    private List<FoodItemDto> menu;
    private List<ReviewDto> reviews;

    // Getters and Setters
    public RestaurantDto getRestaurantProfile() {
        return restaurantProfile;
    }

    public void setRestaurantProfile(RestaurantDto restaurantProfile) {
        this.restaurantProfile = restaurantProfile;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<FoodItemDto> getMenu() {
        return menu;
    }

    public void setMenu(List<FoodItemDto> menu) {
        this.menu = menu;
    }

    public List<ReviewDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewDto> reviews) {
        this.reviews = reviews;
    }
}
