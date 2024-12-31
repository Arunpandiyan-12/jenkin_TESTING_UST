package com.example.Schoolservices.controller;

import com.example.Schoolservices.entity.SchoolInfo;
import com.example.Schoolservices.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    // Add a new school
    @PostMapping
    public SchoolInfo addSchool(@RequestBody SchoolInfo schoolInfo) {
        System.out.println("Received school: " + schoolInfo);
        return schoolService.addSchool(schoolInfo);
    }


    // Get all schools
    @GetMapping
    public ResponseEntity<List<SchoolInfo>> getAllSchools() {
        List<SchoolInfo> schools = schoolService.getAllSchools();
        return ResponseEntity.ok(schools);
    }

    // Get a school by its ID
    @GetMapping("hi")
    public  String greet(){
        return "hello";
    }
    @GetMapping("/{id}")
    public ResponseEntity<SchoolInfo> getSchoolById(@PathVariable int id) {
        SchoolInfo schoolInfo = schoolService.getByid(id);
        if (schoolInfo != null) {
            return ResponseEntity.ok(schoolInfo);
        } else {
            return ResponseEntity.notFound().build();  // Return 404 if not found
        }
    }
}
