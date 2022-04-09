package com.example.corona_virus_tracker_web.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevCases;
}
