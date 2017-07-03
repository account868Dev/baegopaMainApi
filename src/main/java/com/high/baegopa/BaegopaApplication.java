package com.high.baegopa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BaegopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaegopaApplication.class, args);
	}
}
