package com.Mssql.PushPullApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class PushPullAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushPullAppApplication.class, args);		
	}

}
