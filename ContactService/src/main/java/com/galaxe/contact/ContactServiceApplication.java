package com.galaxe.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.galaxe.contact")
@EntityScan(basePackages = "com.galaxe.contact.model")
@EnableJpaRepositories(basePackages= "com.galaxe.contact.dao")
@SpringBootApplication
public class ContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceApplication.class, args);
		
		System.out.println("It's working....");
	}

}
