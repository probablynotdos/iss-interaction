package com.iss.interaction.api.gateway;

import com.iss.interaction.api.gateway.mapper.IssStatusMapper;
import com.iss.interaction.api.resource.IssStatusResource;
import com.iss.interaction.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IssApiGateway {

    @Autowired
    private IssStatusMapper mapper;

    @Autowired
    private AppConfig appConfig;

    private RestTemplate restTemplate = new RestTemplate();

    public IssStatusResource getCurrentLocation() {

        return mapper.toResource(restTemplate.getForEntity(appConfig.getUri(), String.class).getBody());
    }
}
