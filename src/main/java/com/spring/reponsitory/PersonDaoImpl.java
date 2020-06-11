package com.spring.reponsitory;

import com.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addPerson(Person person) {
        String sql = "insert into Person(Name,Location) values(?,?)";
        jdbcTemplate.update(sql, person.getName(), person.getLocation());
    }

    public void updatePerson(Person person) {
        String sql = "update Person set Name=?,Location=? where Id=?";
        jdbcTemplate.update(sql, person.getName(), person.getLocation(), person.getId());
    }

    public void deletePerson(int id) {
        String sql = "delete from Person where Id=?";
        jdbcTemplate.update(sql, id);
    }

    public Person getPersonById(int id) {
        String sql = "select * from Person where Id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Person>() {
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                Person person = new Person();
                person.setId(resultSet.getInt("Id"));
                person.setName(resultSet.getString("Name"));
                person.setLocation(resultSet.getString("Location"));
                return person;
            }
        });

    }

    public List<Person> getAllPerson() {
        String sql = "select * from Person";
        return jdbcTemplate.query(sql, new Object[]{}, new RowMapper<Person>() {
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                Person person = new Person();
                person.setId(resultSet.getInt("Id"));
                person.setName(resultSet.getString("Name"));
                person.setLocation(resultSet.getString("Location"));
                return person;
            }
        });
    }
}
