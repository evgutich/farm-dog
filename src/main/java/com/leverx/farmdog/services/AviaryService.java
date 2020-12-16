package com.leverx.farmdog.services;

import com.leverx.farmdog.places.Aviary;

import java.util.List;

public interface AviaryService {

    void createSomeAviaries(int count, List<Aviary> aviaries);

    void addDogsToAviaries(List<Aviary> aviaries);

    void clearAllAviaries(List<Aviary> aviaries);
}
