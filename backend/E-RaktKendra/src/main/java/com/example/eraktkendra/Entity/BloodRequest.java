package com.example.eraktkendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloodRequestId;

    //One to One Mapping of user
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userId;

    @Column(name = "blood_type", nullable = false)
    private String bloodType;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "total_cost", nullable = false)
    private Long totalCost;
}
