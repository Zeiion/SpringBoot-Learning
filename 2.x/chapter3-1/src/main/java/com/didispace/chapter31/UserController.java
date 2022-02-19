package com.didispace.chapter31;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/users")
    public List<User> getUser(@RequestParam("name") String name){
        return userService.getByName(name);
    }
}
