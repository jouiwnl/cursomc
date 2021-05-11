package com.estagiobetha.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estagiobetha.services.DBService;


@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() {
		
		return true;
	}
	
}
