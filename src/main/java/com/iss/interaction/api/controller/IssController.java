package com.iss.interaction.api.controller;

import com.iss.interaction.api.gateway.IssApiGateway;
import com.iss.interaction.api.repository.IssLocationRepository;
import com.iss.interaction.api.resource.IssLocation;
import com.iss.interaction.api.resource.IssStatusResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssController {

    @Autowired
    private IssLocationRepository repository;

    @Autowired
    private IssApiGateway gateway;

    @GetMapping("/location")
    private IssLocation getLocation() {
        IssStatusResource resource = gateway.getCurrentLocation();

        final String latitude = resource.getPosition().getLatitude();
        final String longitude = resource.getPosition().getLongitude();

        IssLocation location = new IssLocation(latitude, longitude, resource.getTimestamp());

        repository.save(location);

        return location;
    }
}
