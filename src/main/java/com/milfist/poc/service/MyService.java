package com.milfist.poc.service;

import com.milfist.poc.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public String Welcome(String userName) {
        return repository.getMessageByUser(userName);
    }

}