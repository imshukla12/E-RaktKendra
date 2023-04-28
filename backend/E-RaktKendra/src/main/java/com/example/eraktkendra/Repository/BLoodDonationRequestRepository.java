package com.example.eraktkendra.Repository;

import com.example.eraktkendra.Entity.BloodDonationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BLoodDonationRequestRepository extends JpaRepository<BloodDonationRequest,Long> {
}
