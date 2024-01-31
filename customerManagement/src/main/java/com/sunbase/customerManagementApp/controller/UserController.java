package com.sunbase.customerManagementApp.controller;

import com.sunbase.customerManagementApp.model.User;
import com.sunbase.customerManagementApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    //User related APIs------------------------------------------------------------------------------------------


    //Create user, now this endpoint is not protected by security so that everyone can create user
    //Rest all endpoints after this are secured.
    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //Get list of users
    @GetMapping("/users")
    public Collection<User> getUsers() {
        return userService.getUsers();
    }

    //Delete user by providing Id
    @DeleteMapping("/delete/{Id}")
    public String deleteUser(@PathVariable Integer Id) {
        return userService.deleteUser(Id);
    }

    //Update user profile
    @PutMapping("/update-profile")
    public String updateProfile(@RequestBody User user, @RequestParam String userEmail, @RequestParam String userPassword) {
        return userService.updateProfile(user, userEmail, userPassword);
    }

    //Get user by Id
    @GetMapping("/user/{Id}")
    public User getUser(@PathVariable Integer Id)
    {
        return  userService.getUser(Id);
    }

}