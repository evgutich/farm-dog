package com.leverx.farmdog.staff.impl;

import com.leverx.farmdog.animals.Dog;
import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.staff.Vet;

public class DefaultVet implements Vet {

    private void cureDog(Dog dog) {
        dog.setHealthy(true);
    }

    @Override
    public void medicalExamination(Aviary aviary) {
        if (!aviary.getDog().isHealthy()) {
            cureDog(aviary.getDog());
        }
    }
}

