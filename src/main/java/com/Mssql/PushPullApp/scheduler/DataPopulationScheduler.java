package com.Mssql.PushPullApp.scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.Mssql.PushPullApp.service.DataPopulationService;

@Component
public class DataPopulationScheduler {

    @Autowired
    private DataPopulationService dataPopulationService;

    @Scheduled(fixedRate = 60000) // Run every 6    0 secs
    public void populateData() {
        dataPopulationService.populateDummyData();
    }
}
