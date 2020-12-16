package com.leverx.farmdog.services;

import com.leverx.farmdog.places.Aviary;

import java.util.List;

public interface FoodService {

    void feedAllDogs(List<Aviary> aviaries);
}
