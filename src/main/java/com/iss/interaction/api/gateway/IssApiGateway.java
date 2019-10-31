package com.iss.interaction.api.gateway;

import com.iss.interaction.api.gateway.mapper.IssStatusMapper;
import com.iss.interaction.api.resource.IssStatusResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IssApiGateway {

    private final static String ISS_API_URL = "http://api.open-notify.org/iss-now.json";

    @Autowired
    private IssStatusMapper mapper;

    private RestTemplate restTemplate = new RestTemplate();

    public IssStatusResource getCurrentLocation() {
        return mapper.toResource(restTemplate.getForEntity(ISS_API_URL, String.class).getBody());
    }
}
