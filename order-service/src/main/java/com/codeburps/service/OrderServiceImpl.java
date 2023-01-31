package com.codeburps.service;

import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrderServiceImpl implements OrderService {

    @Value("${app.region.id}")
    private int regionId;

    @Override
    public Order placeOrder(OrderDto orderDto) {
        var customerId = ThreadLocalRandom.current().nextInt(100, 200 + 1);
        return new Order(123, customerId, orderDto.getItems(), 123.45, regionId);
    }
}
