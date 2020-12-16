package com.leverx.farmdog.animals;

import java.util.Random;

public class DogFactory {

    private static final Random RANDOM = new Random();

    public int getRandomIntInRange(int min, int max) {
        return RANDOM.nextInt((max - min + 1) + min);
    }

    public Dog createRandomDog() {
        return new Dog(getRandomIntInRange(1,13), getRandomIntInRange(20, 60), getRandomIntInRange(60, 140), RANDOM.nextBoolean());
    }
}
