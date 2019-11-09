package com.iss.interaction.api.controller;

import com.iss.interaction.api.resource.Astronaut;
import com.iss.interaction.api.resource.Location;
import com.iss.interaction.api.service.AstronautsService;
import com.iss.interaction.api.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private AstronautsService astronautsService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/location")
    private Location getLocation() {

        return locationService.getLocation();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/astronauts")
    private List<Astronaut> getAstronauts() {

        return astronautsService.getAstronauts();
    }
}
