package com.geekster.User.Management.System.controllers;

import com.geekster.User.Management.System.models.User;
import com.geekster.User.Management.System.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("addUser")
    public String addUser(@Validated @RequestBody User user){
    return userService.saveUser(user);
    }

    @GetMapping("getUser/{userid}")
    public User getuserById(@PathVariable String userid){
         User userDetails=userService.getUserDetails(userid);
         return userDetails;
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser(){
        return userService.getallDetails();
    }

    @PutMapping("updateUserInfo/{userId}")
    public String updateInfo(@PathVariable String userId, @RequestBody User user){
        return userService.updateById(userId,user);
    }

    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId){
        return userService.delete(userId);
    }
}
