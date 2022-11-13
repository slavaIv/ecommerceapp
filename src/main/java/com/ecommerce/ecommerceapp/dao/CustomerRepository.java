package com.ecommerce.ecommerceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerceapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
