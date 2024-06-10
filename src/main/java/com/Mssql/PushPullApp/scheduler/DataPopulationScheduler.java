package com.Mssql.PushPullApp.scheduler;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.Mssql.PushPullApp.service.DataPopulationService;


@Component
public class DataPopulationScheduler {

    @Autowired
    private DataPopulationService dataPopulationService;

    @Scheduled(fixedRate = 1000) // Run every 1000 milliseconds
    public void populateData() {
        dataPopulationService.populateDummyData();
    }

    @Scheduled(fixedRate = 2000) // Run select query every 5 seconds
    public void executeSelectQuery() {
          dataPopulationService.getAllUsers(); // Assuming getAllUsers method fetches all users

    }

}
