package com.fiberftw.demotest.Api.controller;

import com.fiberftw.demotest.Api.model.User;
import com.fiberftw.demotest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id){
        Optional<User> user = userService.getUser(id);
        return user.orElse(null);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
