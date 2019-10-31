package com.iss.interaction.api.controller;

import com.iss.interaction.api.gateway.IssApiGateway;
import com.iss.interaction.api.resource.IssStatusResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssController {

    @Autowired
    private IssApiGateway gateway;

    @RequestMapping("/location")
    private String getLocation() {
        IssStatusResource resource = gateway.getCurrentLocation();

       return resource.getPosition().getLatitude() + " " + resource.getPosition().getLongitude();
    }
}
