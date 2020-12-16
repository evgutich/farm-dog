package com.leverx.farmdog.staff.impl;

import com.leverx.farmdog.animals.Dog;
import com.leverx.farmdog.animals.Food;
import com.leverx.farmdog.animals.Work;
import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.staff.ServiceStaff;

import static com.leverx.farmdog.animals.Food.*;
import static com.leverx.farmdog.animals.Work.*;

public class DefaultServiceStaff implements ServiceStaff {

    @Override
    public void cleaningAviary(Aviary aviary) {
        if (!aviary.isClean()) {
            aviary.setClean(true);
        }
    }

    private void feedDog(Dog dog, Food food) {
        while (!dog.isWellFed()) {
            dog.setSatiety(dog.getSatiety() + food.getNutritional());
        }
    }

    @Override
    public void feedDogDependOfAge(Dog dog) {
        if (dog.getAge() < 3) {
            feedDog(dog, PUPPIES_FOOD);
        } else if (dog.getAge() >= 3 && dog.getAge() <= 8) {
            feedDog(dog, ADULT_DOGS_FOOD);
        } else if (dog.getAge() > 8) {
            feedDog(dog, OLD_DOGS_FOOD);
        }
    }

    @Override
    public void trainPuppies(Dog dog) {
        dog.setExperience(dog.getExperience() + 10);
        dog.setSatiety(dog.getSatiety() - 30);
    }

    @Override
    public Work sendToWork(Dog dog) {
        if (dog.getExperience() > 130) {
            return GUIDE_DOG;
        } else if (dog.getExperience() > 120) {
            return LIFEGUARD;
        } else return POLICE;
    }
}
