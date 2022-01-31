package com.example.springboot.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestDBConfig implements DBConfig{

	@Override
	public String dbConfig() {
		// TODO Auto-generated method stub
		return "This is TestDBConfig";
	}

}
