package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QtimeganApplication {

	public static void main(String[] args) {
		System.out.println("testing");
		SpringApplication.run(QtimeganApplication.class, args);
	}



}
