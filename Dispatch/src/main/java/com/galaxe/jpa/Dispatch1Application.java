package com.galaxe.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.galaxe.jpa")
@EntityScan(basePackages="com.galaxe.jpa")
@EnableJpaRepositories(basePackages= "com.galaxe.jpa.dao")
public class Dispatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dispatch1Application.class, args);
		
		System.out.println("It is Alive");
	}


}
