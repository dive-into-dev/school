package com.altaf.school.controller;

import com.altaf.school.dao.UserRepository;
import com.altaf.school.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
