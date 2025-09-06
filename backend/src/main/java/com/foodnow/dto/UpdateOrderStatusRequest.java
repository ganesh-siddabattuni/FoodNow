package com.foodnow.dto;
import com.foodnow.model.OrderStatus;

public class UpdateOrderStatusRequest {
    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}