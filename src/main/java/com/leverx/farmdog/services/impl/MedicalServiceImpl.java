package com.leverx.farmdog.services.impl;

import com.leverx.farmdog.places.Aviary;
import com.leverx.farmdog.services.MedicalService;
import com.leverx.farmdog.staff.Vet;
import com.leverx.farmdog.staff.impl.DefaultVet;

import java.util.List;

public class MedicalServiceImpl implements MedicalService {

    private final Vet vet = new DefaultVet();

    @Override
    public void cureAllDogs(List<Aviary> aviaries) {
        for (Aviary aviary : aviaries) {
            vet.medicalExamination(aviary);
        }
        System.out.println("All dogs was cured");
    }
}
