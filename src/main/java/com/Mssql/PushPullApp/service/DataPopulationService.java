package com.Mssql.PushPullApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mssql.PushPullApp.Repositories.UserRepository;
import com.Mssql.PushPullApp.entities.Users;

import java.util.List;
import java.util.Random;

@Service
public class DataPopulationService {

    @Autowired
    private UserRepository userRepository;

    public void populateDummyData() {
        Random random = new Random();
        long num=random.nextInt(1000000);
        for (long i = num; i < num+10; i++) {
            Users user = new Users();
            user.setId(i);
            user.setName("User" + i);
            user.setEmail("user" + i + "@example.com");
            // System.out.println(user.toString());
            userRepository.save(user);
        }
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

}
