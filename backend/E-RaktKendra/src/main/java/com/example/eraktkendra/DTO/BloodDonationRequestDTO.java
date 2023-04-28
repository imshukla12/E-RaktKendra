package com.example.eraktkendra.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodDonationRequestDTO {
    private Long bankId;
    private String bloodType;
    private Long quantity;
    private Long userId;
}
