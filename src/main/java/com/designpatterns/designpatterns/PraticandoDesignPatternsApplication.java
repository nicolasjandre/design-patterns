package com.designpatterns.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PraticandoDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticandoDesignPatternsApplication.class, args);
	}

}
