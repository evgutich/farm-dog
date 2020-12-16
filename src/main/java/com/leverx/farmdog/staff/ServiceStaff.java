package com.leverx.farmdog.staff;

import com.leverx.farmdog.animals.Dog;
import com.leverx.farmdog.animals.Work;
import com.leverx.farmdog.places.Aviary;

public interface ServiceStaff {

    void cleaningAviary(Aviary aviary);

    void feedDogDependOfAge(Dog dog);

    void trainPuppies(Dog dog);

    Work sendToWork(Dog dog);
}
