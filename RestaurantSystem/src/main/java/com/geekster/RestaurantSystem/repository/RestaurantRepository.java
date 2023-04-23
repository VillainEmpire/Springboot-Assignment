package com.geekster.RestaurantSystem.repository;

import org.springframework.stereotype.Repository;
import com.geekster.RestaurantSystem.model.RestaurantModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepository {

    private List<RestaurantModel> restaurantList;

    public RestaurantRepository() {
        restaurantList = new ArrayList<>();
        restaurantList.add(new RestaurantModel(1, "Test Restaurant", "123 Main St", "123-456-7890", "Italian", 10));
    }

    public List<RestaurantModel> getRestaurantsFromDataSource() {
        return restaurantList;
    }

    public boolean save(RestaurantModel restaurant) {
        restaurantList.add(restaurant); //mock Database call
        return true;
    }

    public boolean remove(RestaurantModel restaurant) {
        restaurantList.remove(restaurant); //mock a database
        return true;
    }

    public boolean update(Integer id, String specialty) {
        boolean updateStatus = false;
        for (RestaurantModel restaurant : restaurantList) {
            if (restaurant.getId()==id) {
                restaurant.setSpecialty(specialty);
                return true; //not mocking the database here to keep things simple.
            }
        }
        return false;
    }


    public RestaurantModel getById(int id) {
        for (RestaurantModel restaurant : restaurantList) {
            if (restaurant.getId()==id) {
                return restaurant;
            }
        }
        return null;
    }
}
