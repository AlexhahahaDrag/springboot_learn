package com.alex.springboot_lettuce.dao;

import com.alex.springboot_lettuce.entity.Person;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class FriendDao {

    private static final String KEY = "friendKey";

    @Resource(name = "redisTemplate")
    private ListOperations<String, Person> opsForList;

    public void addFriend(Person person) {
        opsForList.leftPush(KEY, person);
    }

    public long getNumberOfFriends(){
        return opsForList.size(KEY);
    }

    public Person getFriendAtIndex(Integer index) {
        return opsForList.index(KEY, index);
    }

    public void removeFriend(Person person) {
        opsForList.remove(KEY, 1, person);
    }
}
