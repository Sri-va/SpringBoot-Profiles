package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.services.DBConfig;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner {

	@Autowired
	private DBConfig db;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(db.dbConfig());
	}

}
