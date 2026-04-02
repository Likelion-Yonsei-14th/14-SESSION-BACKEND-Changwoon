package com.example.demo.config;

import com.example.demo.discount.FixDiscountPolicy;
import com.example.demo.discount.DiscountPolicy;
import com.example.demo.service.OrderService;

public class Appconfig {
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    public OrderService orderService() {
        return new OrderService(discountPolicy());
    }

}
