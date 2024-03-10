package com.muchiri.jdbcdemo.dao;

import com.muchiri.jdbcdemo.domain.Person;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonDao extends CrudRepository<Person, Integer> {
    @Query(value = "SELECT person_id, first_name, last_name, email::TEXT FROM person")
    List<Person> findAll();

    Person findByPersonId(int userId);

    Person save(Person user);

    void deleteByPersonId(int userId);
}
