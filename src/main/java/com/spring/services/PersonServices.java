package com.spring.services;

import com.spring.model.Person;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PersonServices {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(int id);
    public Person getPersonById(int id);
    public List<Person> getAllPerson();
}
