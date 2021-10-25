package com.example.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.db.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class DbApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("All persons -> {}", personJdbcDao.findAll());
		logger.info("Person with id:1001 -> {}", personJdbcDao.findById(1001));
		logger.info("Person with id:1002 deleted, count -> {}", personJdbcDao.deleteById(1002));
	}

}
