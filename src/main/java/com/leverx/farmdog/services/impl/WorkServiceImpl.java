package com.leverx.farmdog.services.impl;

import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.places.WorkPlace;
import com.leverx.farmdog.services.WorkService;

import java.util.ArrayList;
import java.util.List;

public class WorkServiceImpl implements WorkService {

    private final WorkPlace workPlace = new WorkPlace();

    @Override
    public void takeAdultDogsToWork(List<Aviary> aviaries) {
        workPlace.setAdultDogs(new ArrayList<>());
        for (Aviary aviary : aviaries) {
            if (aviary.getDog().isTrained()) {
                workPlace.getAdultDogs().add(aviary.getDog());
                aviary.setClean(false);
            }
        }
        workPlace.workDay();
        System.out.println("Adult dogs worked");
    }
}
