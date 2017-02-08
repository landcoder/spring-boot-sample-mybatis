package com.example.service;

import com.example.dto.People;
import com.example.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc
 * Created by Mustang on 17/2/8.
 */
@Service("peopleService")
public class PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    public People get(String name) {
        return peopleMapper.get(name);
    }

}
