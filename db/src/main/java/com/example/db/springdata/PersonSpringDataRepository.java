package com.example.db.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.entity.Person;

public interface PersonSpringDataRepository
	extends JpaRepository<Person, Integer> {
	
}
