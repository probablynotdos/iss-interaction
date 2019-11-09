package com.iss.interaction.api.service.impl;

import com.iss.interaction.api.gateway.IssApiGateway;
import com.iss.interaction.api.resource.IssLocation;
import com.iss.interaction.api.resource.Location;
import com.iss.interaction.api.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private IssApiGateway gateway;

    @Override
    public Location getLocation() {

        return getCurrentLocation(gateway.getCurrentLocation());
    }

    private Location getCurrentLocation(IssLocation resource) {

        return new Location(resource.getPosition().getLatitude(), resource.getPosition().getLongitude(), resource.getTimestamp());
    }
}
