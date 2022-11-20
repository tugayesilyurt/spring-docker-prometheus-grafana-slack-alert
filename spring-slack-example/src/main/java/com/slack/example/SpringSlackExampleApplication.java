package com.slack.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSlackExampleApplication {

	public static void main(String[] args) {
		
		try {
		SpringApplication.run(SpringSlackExampleApplication.class, args);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
