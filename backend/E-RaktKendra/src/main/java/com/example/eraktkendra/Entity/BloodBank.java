package com.example.eraktkendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloodId;
    @Column(name = "blood_type", nullable = false, unique = true)
    private String bloodType;
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    @Column(name = "cost_per_unit", nullable = false)
    private Long costPerUnit;

}
