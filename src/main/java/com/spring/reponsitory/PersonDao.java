package com.spring.reponsitory;

import com.spring.model.Person;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PersonDao {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(int id);
    public Person getPersonById(int id);
    public List<Person> getAllPerson();
}
