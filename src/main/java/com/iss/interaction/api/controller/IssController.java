package com.iss.interaction.api.controller;

import com.iss.interaction.api.gateway.IssApiGateway;
import com.iss.interaction.api.resource.Astronaut;
import com.iss.interaction.api.resource.IssLocation;
import com.iss.interaction.api.resource.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssController {

    @Autowired
    private IssApiGateway gateway;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/location")
    private Location getLocation() {
        IssLocation resource = gateway.getCurrentLocation();

        final String latitude = resource.getPosition().getLatitude();
        final String longitude = resource.getPosition().getLongitude();

        return new Location(latitude, longitude, resource.getTimestamp());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/astronauts")
    private List<Astronaut> getAstronauts() {

        return gateway.getAstronautsInSpace().getPeople();
    }
}
