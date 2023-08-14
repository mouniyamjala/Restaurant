package com.Restaurant.Restaurant.dto;
import jakarta.persistence.*;

@Entity(name="Restaurant")
public class RestaurantDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int restaurantId;
    private String restaurantName;
    @OneToOne
    private AddressDto addressDto;

}
