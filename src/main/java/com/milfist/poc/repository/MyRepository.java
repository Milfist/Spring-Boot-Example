package com.milfist.poc.repository;

import com.milfist.poc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    @Autowired
    private UserMapper userMapper;

    public MyRepository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String getMessageByUser(String userName) {
        String language = userMapper.getLanguageByUser(userName);

        return userMapper.getMessageByLanguage(language);
    }
}
