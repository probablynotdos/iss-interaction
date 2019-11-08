package com.iss.interaction.api.resource.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iss.interaction.api.resource.IssAstronauts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AstronautMapper {

    public IssAstronauts toResource(String content) {
        ObjectMapper mapper = new ObjectMapper();
        IssAstronauts resource = new IssAstronauts();

        try {
            resource = mapper.readValue(content, IssAstronauts.class);
        } catch (Exception e) {
            log.error("Error while converting Iss API response");
        }

        return resource;
    }
}
