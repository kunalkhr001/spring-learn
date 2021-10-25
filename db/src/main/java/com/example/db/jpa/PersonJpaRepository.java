package com.example.db.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.db.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id)
	{
		return entityManager.find(Person.class, id);
	}
	
	public List<Person> findAll()
	{
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return namedQuery.getResultList();	
	}
	
	public Person upsert(Person person)
	{
		return entityManager.merge(person);
	}
	
	public void deleteById(int id)
	{
		Person person = findById(id);
		entityManager.remove(person);
	}
}
