package com.example.eraktkendra.Controller;

import com.example.eraktkendra.DTO.FieldWorkerDTO;
import com.example.eraktkendra.DTO.LoginDTO;
import com.example.eraktkendra.Entity.FieldWorker;
import com.example.eraktkendra.Service.FieldWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//        return workerService.workerLogin(loginDTO);
    }
}
