package com.example.corona_virus_tracker_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCoronaVirusTrackerProjectApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringCoronaVirusTrackerProjectApplication.class, args);
    }
}
