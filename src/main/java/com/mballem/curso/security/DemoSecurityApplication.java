package com.mballem.curso.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSecurityApplication {

	public static void main(String[] args) {
	//	System.out.println(new BCryptPasswordEncoder().encode("asd123"));
		SpringApplication.run(DemoSecurityApplication.class, args);
	}
}
