package com.leverx.farmdog.services.impl;

import com.leverx.farmdog.animals.DogFactory;
import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.places.AviaryFactory;
import com.leverx.farmdog.services.AviaryService;
import com.leverx.farmdog.staff.ServiceStaff;
import com.leverx.farmdog.staff.impl.DefaultServiceStaff;

import java.util.List;

public class AviaryServiceImpl implements AviaryService {

    private final AviaryFactory aviaryFactory = new AviaryFactory();
    private final DogFactory dogFactory = new DogFactory();
    private final ServiceStaff serviceStaff = new DefaultServiceStaff();

    @Override
    public void createSomeAviaries(int count, List<Aviary> aviaries) {
        for (int i = 0; i < count; i++) {
            aviaries.add(aviaryFactory.createRandomEmptyAviary());
        }
    }

    @Override
    public void addDogsToAviaries(List<Aviary> aviaries) {
        for (Aviary aviary : aviaries) {
            aviary.setDog(dogFactory.createRandomDog());
        }
    }

    @Override
    public void clearAllAviaries(List<Aviary> aviaries) {
        for (Aviary aviary : aviaries) {
            serviceStaff.cleaningAviary(aviary);
        }
        System.out.println("All aviaries was cleaned");
    }
}
