package com.leverx.farmdog.animals;

public enum Work {
    POLICE(30),
    LIFEGUARD(40),
    GUIDE_DOG(50);

    private final int energy;

    Work(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
}
