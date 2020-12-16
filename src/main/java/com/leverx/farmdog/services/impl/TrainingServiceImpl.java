package com.leverx.farmdog.services.impl;

import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.places.TrainingGround;
import com.leverx.farmdog.services.TrainingService;

import java.util.ArrayList;
import java.util.List;

public class TrainingServiceImpl implements TrainingService {

    private final TrainingGround trainingGround = new TrainingGround();

    @Override
    public void takePuppiesToTrainingGround(List<Aviary> aviaries) {
        trainingGround.setPuppies(new ArrayList<>());
        for (Aviary aviary : aviaries) {
            if (aviary.getDog().getAge() < 3) {
                trainingGround.getPuppies().add(aviary.getDog());
                aviary.setClean(false);
            }
        }
        trainingGround.trainingSession();
        System.out.println("All puppies was trained");
    }
}
