package com.example.controller;

import com.example.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    protected static Logger logger = LoggerFactory.getLogger(PeopleController.class);

	@Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/people/{name}")
    public Object get(@PathVariable String name){
        logger.debug("path:/people/{}....",name);
        return peopleService.get(name);
    }

    @RequestMapping(value = "/")
    public String index() {
        return "hello world";
    }

}
