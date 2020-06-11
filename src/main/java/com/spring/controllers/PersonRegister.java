package com.spring.controllers;

import com.spring.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import sun.invoke.empty.Empty;


@Component
public class PersonRegister implements Validator {


    public boolean supports(Class<?> aClass) {
        return aClass.equals(Person.class);
    }

    public void validate(Object o, Errors errors) {

    }
}
