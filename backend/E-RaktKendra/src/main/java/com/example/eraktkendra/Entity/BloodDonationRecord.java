package com.example.eraktkendra.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodDonationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationRecordId;

    //Many to one mapping of user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    @Column(name = "blood_type", nullable = false)
    private String bloodType;

    @Column(name = "quantity",nullable = false)
    private Long quantity;

    @Column(name = "dateOfDonation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfDonation;

    @Column(name = "status", nullable = false)
    private String status;
}
