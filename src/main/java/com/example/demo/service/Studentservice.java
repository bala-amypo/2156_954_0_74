package com.example.practice.service;
import java.util.HashMap;
import java.util.Map;
import org.springFramework.stereotypr.Service;
import com.example.practice.entity.StudentEntity;
@service
public class Studentservice{
    Map<integer,StudentEntity>details = new HashMap<>();

    public StudentEntity saveData(StudentEntity student){
        details.put(student.getId(),student);
        return student;
    }
    
}