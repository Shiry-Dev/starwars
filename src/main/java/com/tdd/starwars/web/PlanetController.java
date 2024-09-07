package com.tdd.starwars.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdd.starwars.domain.Planet;
import com.tdd.starwars.domain.service.PlanetService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("v1/planets")
public class PlanetController {

    private final PlanetService planetService;

    public PlanetController (PlanetService planetService) {
        this.planetService = planetService;
    }

    @PostMapping
    public ResponseEntity<Planet> create (@RequestBody Planet planet) {
        Planet planetCreated = planetService.create(planet);
        return ResponseEntity.status(HttpStatus.CREATED).body(planetCreated);
    }
    
}
