package com.df.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.df.todo.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService debService;
	
	@Bean
	public boolean instacia() {
		this.debService.instanciaBaseDeDados();
		return true;
	}
}
