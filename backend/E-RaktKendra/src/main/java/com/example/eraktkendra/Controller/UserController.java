package com.example.eraktkendra.Controller;

import com.example.eraktkendra.DTO.BloodRequestDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.DTO.BloodDonationRequestDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.BloodRequest;
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

    // ------------------------------------------- user Login ----------------------------------------------------------
    @GetMapping("/userLogin")
    public User userLogin(@RequestBody LoginDTO loginDTO) {
        return userService.userLogin(loginDTO);
    }

    //------------------------------------------- user blood donation request ------------------------------------------
    @PostMapping("/userDonationRequest")
    public BloodDonationRequest userDonationRequest(@RequestBody BloodDonationRequestDTO bloodDonationRequestDTO){
        return userService.userDonationRequest(bloodDonationRequestDTO);
    }

    //---------------------------------------------- user blood request ------------------------------------------------
    @PostMapping("/userBloodRequest")
    public BloodRequest userBloodRequest(@RequestBody BloodRequestDTO bloodRequestDTO){
        return userService.userBloodRequest(bloodRequestDTO);
    }
}
