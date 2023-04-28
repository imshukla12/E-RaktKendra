package com.example.eraktkendra.Service.ServiceImpl;

import com.example.eraktkendra.DTO.FieldWorkerDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.FieldWorker;
import com.example.eraktkendra.Repository.BLoodDonationRequestRepository;
import com.example.eraktkendra.Repository.FieldWorkerRepository;
import com.example.eraktkendra.Service.FieldWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldWorkerServiceImpl implements FieldWorkerService {
    @Autowired
    private FieldWorkerRepository fieldWorkerRepository;

    @Autowired
    private BLoodDonationRequestRepository bLoodDonationRequestRepository;

    //------------------------------------------------ FieldWorker Login -----------------------------------------------
    @Override
    public FieldWorkerDTO workerLogin(LoginDTO loginDTO) {
        FieldWorker fieldWorker = fieldWorkerRepository.findByEmailId(loginDTO.getUsername());
        if((fieldWorker != null) && fieldWorker.getPassword().equals(loginDTO.getPassword())) {
            System.out.println(fieldWorker);
            return new FieldWorkerDTO(
                    fieldWorker.getWorkerId(),
                    fieldWorker.getTitle(),
                    fieldWorker.getFirstName(),
                    fieldWorker.getLastName(),
                    fieldWorker.getDob(),
                    fieldWorker.getGender(),
                    fieldWorker.getPhoneNumber(),
                    fieldWorker.getEmailId(),
                    fieldWorker.getAddress(),
                    fieldWorker.getCity(),
                    fieldWorker.getPincode(),
                    fieldWorker.getBloodBank().getBloodBankId()
            );
        }
        else
            return null;
    }

    //------------------------------- field worker can view all the blood donation requests ----------------------------
    @Override
    public List<BloodDonationRequest> getAllBloodDonationRequests(long bankId) {
        return bLoodDonationRequestRepository.findByBankId(bankId);
    }
}
