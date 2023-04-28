package com.example.eraktkendra.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldWorkerDTO {

    private Long workerId;

    private String title;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dob;

    private String gender;

    private String phoneNumber;

    private String emailId;

    private String address;

    private String city;

    private Long pincode;

    private long bloodBankId;
}
