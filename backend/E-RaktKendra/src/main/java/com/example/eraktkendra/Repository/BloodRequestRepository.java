package com.example.eraktkendra.Repository;

import com.example.eraktkendra.Entity.BloodRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloodRequestRepository extends JpaRepository<BloodRequest,Long> {
}
