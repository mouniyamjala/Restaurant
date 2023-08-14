package com.Restaurant.Restaurant.dto;
import jakarta.persistence.*;

@Entity(name="address")
public class AddressDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String houseNo;
    private String addressLine1;
    private String addressLine2;
    private String city;

    private String state;
    private String country;
    private String zipCode;

    @OneToOne
    @JoinColumn(name="restaurantId")
    private RestaurantDto restaurantDto;
}

