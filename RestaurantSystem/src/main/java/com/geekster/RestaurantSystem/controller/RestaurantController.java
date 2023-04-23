package com.geekster.RestaurantSystem.controller;

import com.geekster.RestaurantSystem.model.RestaurantModel;
import com.geekster.RestaurantSystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/getAllRestaurants")
    public List<RestaurantModel> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping(value = "/getRestaurantById/{id}")
    public RestaurantModel getRestaurantById(@PathVariable int id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(@RequestBody RestaurantModel restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping(value = "/updateRestaurant/{id}/{specialty}")
    public String updateRestaurant(@PathVariable int id, @PathVariable String specialty) {
        return restaurantService.updateRestaurant(id, specialty);
    }

    @DeleteMapping(value = "/deleteRestaurant/{id}")
    public String deleteRestaurant(@PathVariable int id) {
        return restaurantService.deleteRestaurant(id);
    }
}
