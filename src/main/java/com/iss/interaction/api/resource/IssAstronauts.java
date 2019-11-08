package com.iss.interaction.api.resource;

import lombok.Data;

import java.util.List;

@Data
public class IssAstronauts {
    private List<Astronaut> people;
    private int number;
    private String message;
}
