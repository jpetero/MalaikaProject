package com.julio.malaika2.controllers;

import com.julio.malaika2.models.User;
import com.julio.malaika2.repositories.UsersRepository;
import com.julio.malaika2.services.IUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    IUsersService usersService;

    Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user) {
        try {
            usersService.save(user);
        } catch (Exception e) {
            log.error("Unable to save user", e);
            e.printStackTrace();
            return "error";
        }
        return user.toString();
    }
}
