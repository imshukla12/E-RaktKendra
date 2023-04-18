package com.example.eraktkendra.Controller;

import com.example.eraktkendra.Entity.User;
import com.example.eraktkendra.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //------------------------------------------------ add user --------------------------------------------------------
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
