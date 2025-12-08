package com.SpringSec.SpringSecEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagement
public class SpringSecExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecExApplication.class, args);
	}

}
