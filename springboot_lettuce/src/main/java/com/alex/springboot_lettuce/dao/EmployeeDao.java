package com.alex.springboot_lettuce.dao;

import com.alex.springboot_lettuce.entity.Person;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static final String KEY = "employeeKey";

    @Resource(name = "redisTemplate")
    private HashOperations<String, Integer, Person> hashOperations;

    public void addEmployee(Person person) {
        hashOperations.put(KEY, person.getId(), person);
    }

    public void updateEmployee(Person person) {
        hashOperations.put(KEY, person.getId(), person);
    }

    public Person getEmployee(Integer id) {
        return hashOperations.get(KEY, id);
    }

    public long getNumberOfEmployees() {
        return hashOperations.size(KEY);
    }

    public Map<Integer, Person> getAllEmployees() {
        return hashOperations.entries(KEY);
    }

    public long deleteEmployees(Integer... ids) {
        return hashOperations.delete(KEY, ids);
    }
}
