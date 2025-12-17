package com.example.practice.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ind id;
    private string name;
    private string email;
    public int getId(){
        
    }
}