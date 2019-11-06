package com.iss.interaction.api.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IssStatusResource {

    @JsonProperty("iss_position")
    private IssPositionResource position;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("message")
    private String status;

    @Data
    public static class IssPositionResource {

        @JsonProperty("latitude")
        private String latitude;

        @JsonProperty("longitude")
        private String longitude;
    }

}
