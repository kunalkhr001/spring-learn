package com.example.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdemo.componentscan.ComponentDao;

@SpringBootApplication
public class SpringdemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoScopeApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringdemoScopeApplication.class, args);
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());
	}

}
