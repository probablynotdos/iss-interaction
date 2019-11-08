package com.iss.interaction.api.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IssLocation {

    @JsonProperty("iss_position")
    private Position position;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("message")
    private String status;

    @Data
    public static class Position {

        @JsonProperty("latitude")
        private String latitude;

        @JsonProperty("longitude")
        private String longitude;
    }

}
