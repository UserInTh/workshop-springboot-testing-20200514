package com.example.pihd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PihdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c
				= SpringApplication.run(PihdApplication.class, args);
		for (String name:c.getBeanDefinitionNames()) {
			System.out.println	(name);
		}
		System.out.print(c.getBeanDefinitionCount());
	}

}
