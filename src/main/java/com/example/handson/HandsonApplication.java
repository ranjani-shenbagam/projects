package com.example.handson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class HandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandsonApplication.class, args);
	}

}
