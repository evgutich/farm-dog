package com.leverx.farmdog.places;

import com.leverx.farmdog.staff.impl.DefaultServiceStaff;
import com.leverx.farmdog.animals.Dog;

import java.util.List;

public class TrainingGround {

    private final DefaultServiceStaff defaultServiceStaff = new DefaultServiceStaff();
    private List<Dog> puppies;

    public void trainingSession() {
        for (Dog puppy : puppies) {
            defaultServiceStaff.trainPuppies(puppy);
        }
    }

    public List<Dog> getPuppies() {
        return puppies;
    }

    public void setPuppies(List<Dog> puppies) {
        this.puppies = puppies;
    }
}
