package com.spring.validators;

import com.spring.model.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Person.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        if(person.getName()== null || person.getName().length()==0){
            errors.rejectValue("name","field.required");
        }
    }
}
