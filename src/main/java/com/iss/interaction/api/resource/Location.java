package com.iss.interaction.api.resource;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "location")
public class Location {

    public Location(String latitude, String longitude, String timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String latitude;

    private String longitude;

    @Column(name = "tms")
    private String timestamp;
}
