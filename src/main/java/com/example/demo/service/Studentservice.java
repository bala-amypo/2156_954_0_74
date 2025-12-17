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
    public java.util.List<StudentEntity>getAllStudentEntity(){
        return new java.util.ArrayList<>(details.values());
    }
    public void deleteStudentById(int id){
        details.remove(id);
    }
    public java,util.optional<StudentEntity> getStudentById(int id){
        return java.util.optional.ofNullable(details.get(id));
    }
    public void insertStudent(StudentEntity student){
        details.put(student.getid(),student);
    }
}