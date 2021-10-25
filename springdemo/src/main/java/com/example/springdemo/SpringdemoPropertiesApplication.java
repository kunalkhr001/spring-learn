package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.example.springdemo.basic.BinarySearchImpl;
import com.example.springdemo.properties.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringdemoPropertiesApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringdemoPropertiesApplication.class, args);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		System.out.println(service.returnServiceURL());
	}

}
