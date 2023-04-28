package com.example.eraktkendra.Service;

import com.example.eraktkendra.DTO.FieldWorkerDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.FieldWorker;

public interface FieldWorkerService {
    FieldWorkerDTO workerLogin(LoginDTO loginDTO);
}
