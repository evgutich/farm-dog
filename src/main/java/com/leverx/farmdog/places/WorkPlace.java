package com.leverx.farmdog.places;

import com.leverx.farmdog.animals.Dog;
import com.leverx.farmdog.staff.ServiceStaff;
import com.leverx.farmdog.staff.impl.DefaultServiceStaff;

import java.util.List;

public class WorkPlace {

    private final ServiceStaff serviceStaff = new DefaultServiceStaff();
    private List<Dog> adultDogs;

    public void workDay() {
        for (Dog adultDog : adultDogs) {
            adultDog.doWork(serviceStaff.sendToWork(adultDog));
        }
    }

    public List<Dog> getAdultDogs() {
        return adultDogs;
    }

    public void setAdultDogs(List<Dog> adultDogs) {
        this.adultDogs = adultDogs;
    }
}
