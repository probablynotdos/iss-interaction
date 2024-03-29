package com.iss.interaction.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:iss.properties")
@ConfigurationProperties(prefix = "iss.uri")
public class AppConfig {

    private String location;
    private String astronaut;
}