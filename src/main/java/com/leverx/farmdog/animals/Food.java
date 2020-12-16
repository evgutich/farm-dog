package com.leverx.farmdog.animals;

public enum Food {
    PUPPIES_FOOD(20),
    ADULT_DOGS_FOOD(20),
    OLD_DOGS_FOOD(20);

    private final int nutritional;

    Food(int nutritional) {
        this.nutritional = nutritional;
    }

    public int getNutritional() {
        return nutritional;
    }
}
