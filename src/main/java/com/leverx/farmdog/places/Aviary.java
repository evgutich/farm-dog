package com.leverx.farmdog.places;

import com.leverx.farmdog.animals.Dog;

public class Aviary {

    private boolean isClean;
    private Dog dog;

    public Aviary(boolean isClean, Dog dog) {
        this.isClean = isClean;
        this.dog = dog;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "isClean=" + isClean +
                ", dog=" + dog +
                '}';
    }
}
