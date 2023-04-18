package com.example.eraktkendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloodRecordId;

    @Column(name = "blood_type",nullable = false)
    private String bloodType;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "cost_per_unit", nullable = false)
    private Long costPerUnit;

    // Many to One Mapping of bloodBank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bankId", referencedColumnName = "bloodBankId")
    private BloodBank bloodBank;
}
