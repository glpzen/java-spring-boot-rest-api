package com.javaspringbootrestapi.jsbra.controller;

import com.javaspringbootrestapi.jsbra.model.User;
import com.javaspringbootrestapi.jsbra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User create(@Valid @RequestBody User user){
        System.out.println(user);
        return userRepository.save(user);
    }
}
