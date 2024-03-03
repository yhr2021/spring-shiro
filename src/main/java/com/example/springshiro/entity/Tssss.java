package com.example.springshiro.entity;

import com.example.springshiro.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class Tssss {



    @Autowired
    private AccountMapper mapper;
    @PostConstruct
    void test(){
        mapper.selectList(null).forEach(System.out::println);
        System.out.println("1,2,3,4");
    }


}
