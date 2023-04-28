package com.example.eraktkendra.Service.ServiceImpl;

import com.example.eraktkendra.DTO.BloodRequestDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.DTO.BloodDonationRequestDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.BloodRequest;
import com.example.eraktkendra.Entity.User;
import com.example.eraktkendra.Repository.BLoodDonationRequestRepository;
import com.example.eraktkendra.Repository.BloodRequestRepository;
import com.example.eraktkendra.Repository.UserRepository;
import com.example.eraktkendra.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BLoodDonationRequestRepository bLoodDonationRequestRepository;

    @Autowired
    private BloodRequestRepository bloodRequestRepository;

    //--------------------------------------- add user -----------------------------------------------------------------
    @Override
    public User addUser(User user) {
            return userRepository.save(user);
    }

    //--------------------------------------- user login --------------------------------------------------------------
    @Override
    public User userLogin(LoginDTO loginDTO) {
        User user = userRepository.findByEmailId(loginDTO.getUsername());
        if((user != null) && user.getPassword().equals(loginDTO.getPassword())) {
            System.out.println(user);
            return user;
        }
        else
            return null;
    }

    //---------------------------------------- user request for blood donation ---------------------------------------------
    @Override
    public BloodDonationRequest userDonationRequest(BloodDonationRequestDTO bloodDonationRequestDTO) {
        User user = userRepository.findById(bloodDonationRequestDTO.getUserId()).get();

        BloodDonationRequest bloodDonationRequest = new BloodDonationRequest(
                user,
                bloodDonationRequestDTO.getBloodType(),
                bloodDonationRequestDTO.getQuantity(),
                bloodDonationRequestDTO.getBankId()
        );

        return bLoodDonationRequestRepository.save(bloodDonationRequest);
    }

    //------------------------------------ user request for blood ------------------------------------------------------
    @Override
    public BloodRequest userBloodRequest(BloodRequestDTO bloodRequestDTO) {
        User user = userRepository.findById(bloodRequestDTO.getUserId()).get();

        BloodRequest bloodRequest = new BloodRequest(
                user,
                bloodRequestDTO.getBloodType(),
                bloodRequestDTO.getQuantity(),
                bloodRequestDTO.getTotalCost()
        );
        return bloodRequestRepository.save(bloodRequest);
    }
}
