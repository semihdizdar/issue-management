package com.semihdizdar.issuemanagement;

import javafx.application.Application;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class IssueManagementApplication {


	public static void main(String[] args) {

		SpringApplication.run(IssueManagementApplication.class, args);


	}



	@Bean
	public ModelMapper getModelMapper(){

		return new ModelMapper();
	}

}
