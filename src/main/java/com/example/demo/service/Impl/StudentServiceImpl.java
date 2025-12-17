package com.example.demo.service.impl;

import java.util.*;
import org.springframework.sterotype.Service;
import com.example.demo.entity.Student;

@service
public class StudentServiceImpl implements StudentService{

    private final Map<Long,Student>store = new HashMap<>();
    private long counter = 1;

    @override
    public student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st):
    }
}