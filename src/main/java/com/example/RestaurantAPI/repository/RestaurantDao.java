package com.example.RestaurantAPI.repository;

import com.example.RestaurantAPI.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RestaurantDao {
    List<Restaurant> list = new ArrayList<>();

    public List<Restaurant> getList(){
        return this.list;
    }

    public boolean add(Restaurant restaurant) {
        list.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant rest) {
        list.remove(rest);
        return true;
    }
}
