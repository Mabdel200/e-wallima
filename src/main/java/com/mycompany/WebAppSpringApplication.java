package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class WebAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringApplication.class, args);
	}

}
