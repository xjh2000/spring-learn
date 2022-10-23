package org.xjh.spring.springLearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xjh.spring.springLearn.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public User getUser() {
        return new User("xjh", "66677");
    }
}
