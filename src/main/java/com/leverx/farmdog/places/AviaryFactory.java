package com.leverx.farmdog.places;

import java.util.Random;

public class AviaryFactory {

    private static final Random RANDOM = new Random();

    public Aviary createRandomEmptyAviary() {
        return new Aviary(RANDOM.nextBoolean(), null);
    }
}
