package com.leverx.farmdog.services.impl;

import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.services.FoodService;
import com.leverx.farmdog.staff.ServiceStaff;
import com.leverx.farmdog.staff.impl.DefaultServiceStaff;

import java.util.List;

public class FoodServiceImpl implements FoodService {

    private final ServiceStaff serviceStaff = new DefaultServiceStaff();

    @Override
    public void feedAllDogs(List<Aviary> aviaries) {
        for (Aviary aviary : aviaries) {
            serviceStaff.feedDogDependOfAge(aviary.getDog());
        }
        System.out.println("All dogs was well fed");
    }
}
