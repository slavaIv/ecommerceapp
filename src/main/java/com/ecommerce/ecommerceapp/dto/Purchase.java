package com.ecommerce.ecommerceapp.dto;

import java.util.Set;

import com.ecommerce.ecommerceapp.entity.Address;
import com.ecommerce.ecommerceapp.entity.Customer;
import com.ecommerce.ecommerceapp.entity.Order;
import com.ecommerce.ecommerceapp.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
