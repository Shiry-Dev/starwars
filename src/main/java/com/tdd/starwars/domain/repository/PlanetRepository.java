package com.tdd.starwars.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdd.starwars.domain.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long>{
    
}
