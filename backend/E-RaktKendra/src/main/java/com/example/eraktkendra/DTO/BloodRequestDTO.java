package com.example.eraktkendra.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodRequestDTO {
    private Long userId;
    private String bloodType;
    private Long quantity;
    private Long totalCost;

}
