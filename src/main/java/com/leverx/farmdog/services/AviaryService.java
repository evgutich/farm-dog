package com.leverx.farmdog.services;

import com.leverx.farmdog.places.Aviary;

import java.util.List;

public interface AviaryService {

    List<Aviary> createSomeAviaries();

    void addDogsToAviaries(List<Aviary> aviaries);

    void clearAllAviaries(List<Aviary> aviaries);
}
