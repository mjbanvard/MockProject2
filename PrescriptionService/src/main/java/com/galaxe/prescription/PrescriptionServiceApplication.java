package com.galaxe.prescription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
//@Slf4j
@ComponentScan("com.galaxe.prescription")
@EntityScan(basePackages = "com.galaxe.prescription.model")
@EnableJpaRepositories(basePackages = "com.galaxe.prescription.dao")
public class PrescriptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrescriptionServiceApplication.class, args);
		
	}

}
