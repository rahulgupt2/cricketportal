package com.tools.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tools.Person;

@Configuration
public class HelloConfig {
	
	@Bean(name="hellobean")
	public Person personobj()
	{
		return new Person();		
	}
}
