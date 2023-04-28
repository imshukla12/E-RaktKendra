package com.example.eraktkendra.Service;

import com.example.eraktkendra.DTO.FieldWorkerDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.BloodRequest;

import java.util.List;

public interface FieldWorkerService {
    FieldWorkerDTO workerLogin(LoginDTO loginDTO);
    List<BloodDonationRequest> getAllBloodDonationRequests(long bankId);
}
