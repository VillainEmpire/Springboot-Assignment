package com.geekster.RestaurantSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantModel {
    private int id;
    private String name;
    private String address;
    private String number;
    private String specialty;
    private int totalStaffs;
}
