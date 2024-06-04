package com.Mssql.PushPullApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mssql.PushPullApp.Repositories.UserRepository;
import com.Mssql.PushPullApp.entities.User;

import java.util.Random;

@Service
public class DataPopulationService {

    @Autowired
    private UserRepository userRepository;

    public void populateDummyData() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("User" + i);
            user.setEmail("user" + i + "@example.com");
            userRepository.save(user);
        }
    }
}
