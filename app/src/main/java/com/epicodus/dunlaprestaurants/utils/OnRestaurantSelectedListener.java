package com.epicodus.dunlaprestaurants.utils;

import com.epicodus.dunlaprestaurants.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by Guest on 9/28/17.
 */

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
