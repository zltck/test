package com.me.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.me.beans.HelloWorld;

@Configuration
public class AppConfig {
	@Bean(name="helloworld")
	public HelloWorld helloworld(){
		
		return new HelloWorld();
				
	}
}
