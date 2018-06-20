package com.milfist.poc.controller;

import com.milfist.poc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
    public String Welcome(
            @PathVariable("userName") String userName
    )
    {
        return service.Welcome(userName);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String Test () {
        return "Hello World!!";
    }

}
