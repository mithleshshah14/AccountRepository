package com.wipro.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.wipro.model.Entity.AccountEntity;

@SpringBootApplication
@ComponentScan("com.wipro")
@EnableJpaRepositories("com.wipro")
@EnableConfigurationProperties
@EntityScan("com.wipro")
public class AccountApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(AccountApi2Application.class, args);
		
		
	}

}