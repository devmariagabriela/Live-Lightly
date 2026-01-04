package com.fitness.ecommerce.repository;

import com.fitness.ecommerce.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {}

@Repository
interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}

@Repository
interface OrderRepository extends JpaRepository<Order, Long> {}

@Repository
interface AddressRepository extends JpaRepository<Address, Long> {}