package com.example.eraktkendra.Controller;

import com.example.eraktkendra.DTO.FieldWorkerDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.BloodDonationRequest;
import com.example.eraktkendra.Entity.BloodRequest;
import com.example.eraktkendra.Entity.FieldWorker;
import com.example.eraktkendra.Service.FieldWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class FieldWorkerController {
    @Autowired
    private FieldWorkerService fieldWorkerService;

    //------------------------------------------------ worker login ----------------------------------------------------
    @GetMapping("/workerLogin")
    public FieldWorkerDTO workerLogin(@RequestBody LoginDTO loginDTO){
        System.out.println(loginDTO.toString());
        FieldWorkerDTO fieldWorkerDTO = fieldWorkerService.workerLogin(loginDTO);
        return fieldWorkerDTO;
    }

    //-------------------------------------------- worker can see all the blood requests -------------------------------
    @GetMapping("/getAllBloodDonationRequests/{bankId}")
    public List<BloodDonationRequest> getAllBloodDonationRequests(@PathVariable String bankId){
        return fieldWorkerService.getAllBloodDonationRequests(Long.parseLong(bankId));
    }
}
