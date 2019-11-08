package com.iss.interaction.api.resource.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iss.interaction.api.resource.IssLocation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IssLocationMapper {

    public IssLocation toResource(String content) {
        ObjectMapper mapper = new ObjectMapper();
        IssLocation resource = new IssLocation();

        try {
            resource = mapper.readValue(content, IssLocation.class);
        } catch (Exception e) {
            log.error("Error while converting Iss API response");
        }

        return resource;
    }
}
