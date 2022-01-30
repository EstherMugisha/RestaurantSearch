package com.example.RestaurantSearch.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantResource{
    @Autowired
    private RestaurantGeoSearchService service;

    @PostMapping
    public void create(RestaurantRepresentation restaurantRep){
        service.createRestaurant(restaurantRep);
    }

    @GetMapping
    public List<Restaurant> findAll(){
        return service.findAll();
    }

    @GetMapping("/findByDistance")
    public List<Restaurant> findByDistance(@RequestParam("long") float longitute,
                                           @RequestParam("lat") float latitude,
                                           @RequestParam("dist") int distance){
        return service.findByDistance(longitute, latitude, distance);
    }
}
