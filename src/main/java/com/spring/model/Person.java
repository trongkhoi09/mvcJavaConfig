package com.spring.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Component
public class Person {
    @Size(min=5,max=20, message = "{person.name.size}")
    @Pattern(regexp = "([a-z]+)", message = "{person.name.pattern}")
    private String name;

    @NotEmpty(message = "{person.location.empty}")
    private String location;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", id=" + id +
                '}';
    }
}
