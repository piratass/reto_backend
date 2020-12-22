package com.reto.backend.entelgy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	   @Autowired
	    Environment env;

	    @Bean
	    public RestTemplate getRestTemplate() {
	        RestTemplateBuilder builder = new RestTemplateBuilder();
	        RestTemplate restTemplate = builder.build();
	        return restTemplate;
	    }
}
