package com.example.RestaurantSearch.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private int zipcode;

    private Location geoLocation;
}
