package com.example.db.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.db.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>
	{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setBirthDate(rs.getDate("birth_date"));
			return person;
		}
		 
	}
	
	public List<Person> findAll()
	{
//		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
		return jdbcTemplate.query("select * from person", new PersonRowMapper());
	}
	
	public Person findById(int id)
	{
		return jdbcTemplate.queryForObject("select * from person where id=?",
				new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id)
	{
		return jdbcTemplate.update("delete from person where id=?", id);
	}
}
