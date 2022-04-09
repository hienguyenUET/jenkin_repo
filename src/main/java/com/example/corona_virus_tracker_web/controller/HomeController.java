package com.example.corona_virus_tracker_web.controller;

import com.example.corona_virus_tracker_web.models.LocationStats;
import com.example.corona_virus_tracker_web.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.util.List;


@Controller
public class HomeController {
    
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    DecimalFormat df = new DecimalFormat("###,###,###");
    
    
    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevCases()).sum();
        model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
        model.addAttribute("totalReportedCases", coronaVirusDataService.getTotalCases());
        model.addAttribute("totalNewCases", df.format(totalNewCases));
        return "home";
    }
}
