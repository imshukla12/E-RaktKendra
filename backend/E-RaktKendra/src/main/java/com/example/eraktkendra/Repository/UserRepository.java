package com.example.eraktkendra.Repository;

import com.example.eraktkendra.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmailId(String emailId);
}
