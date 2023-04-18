package com.example.eraktkendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodRequestRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestRecordId;

    //One to One mapping of user
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    @Column(name = "blood_type", nullable = false)
    private String bloodType;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "total_cost", nullable = false)
    private Long totalCost;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "bankId", nullable = false)
    private Long bankId;
}
