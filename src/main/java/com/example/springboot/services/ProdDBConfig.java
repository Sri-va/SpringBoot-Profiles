package com.example.springboot.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("product")
public class ProdDBConfig implements DBConfig {

	@Override
	public String dbConfig() {
		// TODO Auto-generated method stub
		return "This is ProdDBConfig";
	}

}
