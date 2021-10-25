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
import com.example.db.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class DbSpringDataApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonSpringDataRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DbSpringDataApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("Person with id:1001 -> {}", repository.findById(1001));
		logger.info("Person update with id:1002 -> {}", repository.save(new Person(1002, "updatedName", new Date(System.currentTimeMillis()))));
		logger.info("Person with new id: -> {}", repository.save(new Person("newName", new Date(System.currentTimeMillis()))));
		repository.deleteById(0);
		logger.info("All persons -> {}", repository.findAll());
//		logger.info("Person with id:1002 deleted, count -> {}", personJdbcDao.deleteById(1002));
	}

}
