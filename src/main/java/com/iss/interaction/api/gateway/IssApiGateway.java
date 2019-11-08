package com.iss.interaction.api.gateway;

import com.iss.interaction.api.resource.IssAstronauts;
import com.iss.interaction.api.resource.IssLocation;
import com.iss.interaction.api.resource.mapper.AstronautMapper;
import com.iss.interaction.api.resource.mapper.IssLocationMapper;
import com.iss.interaction.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IssApiGateway {

    @Autowired
    private IssLocationMapper statusMapper;

    @Autowired
    private AstronautMapper astronautMapper;

    @Autowired
    private AppConfig appConfig;

    private RestTemplate restTemplate = new RestTemplate();

    public IssLocation getCurrentLocation() {

        return statusMapper.toResource(restTemplate.getForEntity(appConfig.getLocation(), String.class).getBody());
    }

    public IssAstronauts getAstronautsInSpace() {
        return astronautMapper.toResource(restTemplate.getForEntity(appConfig.getAstronaut(), String.class).getBody());
    }
}
