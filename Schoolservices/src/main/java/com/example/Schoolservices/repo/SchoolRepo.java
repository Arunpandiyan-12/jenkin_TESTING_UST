package com.example.Schoolservices.repo;

import com.example.Schoolservices.entity.SchoolInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<SchoolInfo, Integer> {
    // Custom query methods can go here
}
