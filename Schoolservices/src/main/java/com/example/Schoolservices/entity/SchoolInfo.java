package com.example.Schoolservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SchoolInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schId;
    private String schName;
    private String schLocation;
    private String schPrinciple;

}
