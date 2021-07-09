package com.galaxe.chanSelect.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.galaxe.chanSelect")
@EntityScan(basePackages="com.galaxe.chanSelect.model")
@EnableJpaRepositories(basePackages= "com.galaxe.chanSelect.dao")
@SpringBootApplication
public class ChannelSelectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelSelectionApplication.class, args);
	}

}
