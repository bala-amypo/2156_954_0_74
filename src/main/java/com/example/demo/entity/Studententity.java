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
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String grtEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public StudentEntity(int id,String name,String email){
        this.id = id;
        this.name = name;
        this
    }
}