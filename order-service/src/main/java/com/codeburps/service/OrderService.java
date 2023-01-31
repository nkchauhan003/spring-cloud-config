package com.codeburps.service;

import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;
import org.springframework.beans.factory.annotation.Value;

public interface OrderService {
    public Order placeOrder(OrderDto orderDto);
}
