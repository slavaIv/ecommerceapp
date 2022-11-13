package com.ecommerce.ecommerceapp.service;

import com.ecommerce.ecommerceapp.dto.Purchase;
import com.ecommerce.ecommerceapp.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
    
}
