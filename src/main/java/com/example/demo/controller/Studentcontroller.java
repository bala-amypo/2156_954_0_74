package com.example.practice.controller;

import java.util.List;
import java.util.optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.practice.entity.StudentEntity;

@RestController
public class Studentcontroller{
    @Autowired
    Studentservice studentservice;

    @postMapping("/add")
    public StudentEntity post(@RequestBody StudentEntity student){
        return studentservice.saveData(student);
    }
     @GetMapping("/get")
     public List<StudentEntity>getAllStudents(){
        return studentservice.getAllStudentById(id);
     }

     @PutMapping("/update/{id}")
     public string update(@RequestBody StudentEntity student,@pathVariable int id){
        optional<StudentEntity>existingStudent = studentservice.getStudentById(id);
        if(existingStudent.isPresent()){
            student.setId(id);
            studentservice.insertStudent(student);
            return "Student updated successfully";
        }
        else{
            return "Student not found";
        }
     }

     @DeleteMapping("/delete/{id}")
     public string delete(@pathVariable int id){
        optional<StudentEntity>student = studentservice.getStudentById(id);
        if(student.isPresent()){
            studentservice.
        }
     }
}