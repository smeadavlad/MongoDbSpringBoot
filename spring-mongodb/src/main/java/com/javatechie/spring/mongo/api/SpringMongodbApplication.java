package com.javatechie.spring.mongo.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.javatechie.spring.mongo.api.repository"})
public class SpringMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

}
