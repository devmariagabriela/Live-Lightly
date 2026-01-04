package com.fitness.ecommerce.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}