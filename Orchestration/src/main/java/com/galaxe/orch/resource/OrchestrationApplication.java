package com.galaxe.orch.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Following three (3) lines are inserted to guarantee accurate Bean Factory searches. They are at most redundant. Edit value to match project
@ComponentScan("com.galaxe.orch")
@EntityScan(basePackages="com.galaxe.orch.model")
@EnableJpaRepositories(basePackages= "com.galaxe.orch.DAO")
@SpringBootApplication
public class OrchestrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationApplication.class, args);
	}

}
