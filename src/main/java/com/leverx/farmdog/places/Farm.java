package com.leverx.farmdog.places;

import com.leverx.farmdog.services.*;
import com.leverx.farmdog.services.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final List<Aviary> aviaries = new ArrayList<>();

    private final AviaryService aviaryService = new AviaryServiceImpl();
    private final FoodService foodService = new FoodServiceImpl();
    private final MedicalService medicalService = new MedicalServiceImpl();
    private final TrainingService trainingService = new TrainingServiceImpl();
    private final WorkService workService = new WorkServiceImpl();

    public void startDay() {
        aviaryService.createSomeAviaries(3, aviaries);
        aviaryService.addDogsToAviaries(aviaries);
        foodService.feedAllDogs(aviaries);
        medicalService.cureAllDogs(aviaries);
        aviaryService.clearAllAviaries(aviaries);
        trainingService.takePuppiesToTrainingGround(aviaries);
        workService.takeAdultDogsToWork(aviaries);
        foodService.feedAllDogs(aviaries);
    }
}
