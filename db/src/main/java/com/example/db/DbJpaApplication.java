package com.example.db;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.db.entity.Person;
import com.example.db.jpa.PersonJpaRepository;

//@SpringBootApplication
public class DbJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJpaRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DbJpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("Person with id:1001 -> {}", repository.findById(1001));
		logger.info("Person update with id:1002 -> {}", repository.upsert(new Person(1002, "updatedName", new Date(System.currentTimeMillis()))));
		logger.info("Person with new id: -> {}", repository.upsert(new Person("newName", new Date(System.currentTimeMillis()))));
		repository.deleteById(0);
		logger.info("All persons -> {}", repository.findAll());
//		logger.info("Person with id:1002 deleted, count -> {}", personJdbcDao.deleteById(1002));
	}

}
