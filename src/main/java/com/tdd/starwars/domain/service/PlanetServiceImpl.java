package com.tdd.starwars.domain.service;

import org.springframework.stereotype.Service;

import com.tdd.starwars.domain.Planet;
import com.tdd.starwars.domain.repository.PlanetRepository;

@Service
public class PlanetServiceImpl implements PlanetService {

    private PlanetRepository repository;

    public PlanetServiceImpl (PlanetRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Planet create(Planet planet) {
        return repository.save(planet);
    }

}
