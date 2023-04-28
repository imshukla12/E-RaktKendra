package com.example.eraktkendra.Repository;

import com.example.eraktkendra.Entity.FieldWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldWorkerRepository extends JpaRepository<FieldWorker,Long> {
    FieldWorker findByEmailId(String emailId);
}

