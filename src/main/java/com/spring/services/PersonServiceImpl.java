package com.spring.services;

import com.spring.model.Person;
import com.spring.reponsitory.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonServices {

    @Autowired
     PersonDao personDao;


    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    public void deletePerson(int id) {
        personDao.deletePerson(id);
    }

    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }
}
