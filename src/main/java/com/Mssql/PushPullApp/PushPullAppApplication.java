package com.Mssql.PushPullApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EntityScan(basePackages = "com.Mssql.PushPullApp.entities")
// @EnableJpaRepositories(basePackages = "com.Mssql.PushPullApp.Repositories")
public class PushPullAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushPullAppApplication.class, args);
	}

}
