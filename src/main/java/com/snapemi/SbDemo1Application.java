package com.snapemi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class SbDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbDemo1Application.class, args);
		System.out.println("Hello Test.....");		
	}

}
