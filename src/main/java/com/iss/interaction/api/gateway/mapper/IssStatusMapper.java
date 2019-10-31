package com.iss.interaction.api.gateway.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iss.interaction.api.resource.IssStatusResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IssStatusMapper {

    public IssStatusResource toResource(String content) {
        ObjectMapper mapper  = new ObjectMapper();
        IssStatusResource resource = new IssStatusResource();

        try {
            resource = mapper.readValue(content, IssStatusResource.class);
        } catch (Exception e) {
         log.error("Error while converting Iss API response");
        }

        return resource;
    }
}
