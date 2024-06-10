package com.Mssql.PushPullApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mssql.PushPullApp.entities.Users;
import com.Mssql.PushPullApp.service.DataPopulationService;

@RestController
@RequestMapping("/api")
public class TempController {

    @Autowired
    private DataPopulationService dataPopulationService;

    @GetMapping("/AllUsers")
    public List<Users> getAllUsersEndpoint(String endpointUrl) {
            return dataPopulationService.getAllUsers();
    }

}
