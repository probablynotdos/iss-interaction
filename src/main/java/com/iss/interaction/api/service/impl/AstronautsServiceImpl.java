package com.iss.interaction.api.service.impl;

import com.iss.interaction.api.gateway.IssApiGateway;
import com.iss.interaction.api.resource.Astronaut;
import com.iss.interaction.api.service.AstronautsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AstronautsServiceImpl implements AstronautsService {

    @Autowired
    private IssApiGateway gateway;

    @Override
    public List<Astronaut> getAstronauts() {
        List<Astronaut> astronauts = gateway.getAstronautsInSpace().getPeople();

        for (Astronaut astronaut : astronauts) {
            formatName(astronaut);
        }

        return astronauts;
    }

    private void formatName(Astronaut astronaut) {
        astronaut.setFormattedName(astronaut.getName().replace(' ', '_'));
    }
}
