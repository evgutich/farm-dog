package com.leverx.farmdog.places;

import com.leverx.farmdog.animals.DogFactory;
import com.leverx.farmdog.staff.ServiceStaff;
import com.leverx.farmdog.staff.Vet;
import com.leverx.farmdog.staff.impl.DefaultServiceStaff;
import com.leverx.farmdog.staff.impl.DefaultVet;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final List<Aviary> aviaries = new ArrayList<>();

    private final AviaryFactory aviaryFactory = new AviaryFactory();
    private final DogFactory dogFactory = new DogFactory();

    private final Vet vet = new DefaultVet();
    private final ServiceStaff serviceStaff = new DefaultServiceStaff();

    private final TrainingGround trainingGround = new TrainingGround();
    private final WorkPlace workPlace = new WorkPlace();

    private void createSomeAviaries(int count) {
        for (int i = 0; i < count; i++) {
            aviaries.add(aviaryFactory.createRandomEmptyAviary());
        }
    }

    private void addDogsToAviaries() {
        for (Aviary aviary : aviaries) {
            aviary.setDog(dogFactory.createRandomDog());
        }
    }

    private void feedAllDogs() {
        for (Aviary aviary : aviaries) {
            serviceStaff.feedDogDependOfAge(aviary.getDog());
        }
        System.out.println("All dogs was well fed");
    }

    private void cureAllDogs() {
        for (Aviary aviary : aviaries) {
            vet.medicalExamination(aviary);
        }
        System.out.println("All dogs was cured");
    }

    private void clearAllAviaries() {
        for (Aviary aviary : aviaries) {
            serviceStaff.cleaningAviary(aviary);
        }
        System.out.println("All aviaries was cleaned");
    }

    private void puppiesGoToTrainingGround() {
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

    private void adultGoToWork() {
        workPlace.setAdultDogs(new ArrayList<>());
        for (Aviary aviary : aviaries) {
            if (aviary.getDog().isTrained()) {
                workPlace.getAdultDogs().add(aviary.getDog());
                aviary.setClean(false);
            }
        }
        workPlace.workDay();
        System.out.println("Adult dogs worked");
    }

    public void startDay() {
        createSomeAviaries(3);
        addDogsToAviaries();
        feedAllDogs();
        cureAllDogs();
        clearAllAviaries();
        puppiesGoToTrainingGround();
        adultGoToWork();
        feedAllDogs();
    }
}
