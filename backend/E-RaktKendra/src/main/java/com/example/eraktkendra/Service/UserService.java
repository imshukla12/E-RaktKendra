package com.example.eraktkendra.Service;

import com.example.eraktkendra.DTO.BloodDonationRequestDTO;
import com.example.eraktkendra.DTO.BloodRequestDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.BloodRequest;
import com.example.eraktkendra.Entity.User;

public interface UserService {
    User addUser(User user);

    User userLogin(LoginDTO loginDTO);

    BloodDonationRequest userDonationRequest(BloodDonationRequestDTO bloodDonationRequestDTO);

    BloodRequest userBloodRequest(BloodRequestDTO bloodRequestDTO);
}
