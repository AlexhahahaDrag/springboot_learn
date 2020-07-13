package com.alex.springboot_lettuce.dao;

import com.alex.springboot_lettuce.entity.Person;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Set;

@Repository
public class FamillyDao {

    private static final String KEY = "myFamilyKey";

    @Resource(name = "redisTemplate")
    private SetOperations<String, Person> setOperations;

    public void addFamilyMembers(Person... people) {
        setOperations.add(KEY, people);
    }

    public Set<Person> getFamilyMembers() {
        return setOperations.members(KEY);
    }
    public long getNumberOfFamilyMembers() {
        return setOperations.size(KEY);
    }
    public long removeFamilyMembers(Person... persons) {
        return setOperations.remove(KEY, (Object[])persons);
    }
}
