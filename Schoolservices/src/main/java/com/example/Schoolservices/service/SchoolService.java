package com.example.Schoolservices.service;

import com.example.Schoolservices.entity.SchoolInfo;
import com.example.Schoolservices.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepository;

    // Method to add a school
    public SchoolInfo addSchool(SchoolInfo schoolInfo) {
        return schoolRepository.save(schoolInfo); // Save to the database
    }

    // Method to get all schools
    public List<SchoolInfo> getAllSchools() {
        return schoolRepository.findAll();
    }

    // Method to get a school by its ID
    public SchoolInfo getByid(int id) {
        return schoolRepository.findById(id).orElse(null); // Return null if not found
    }
}
