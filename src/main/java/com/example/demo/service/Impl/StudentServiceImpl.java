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
        store.put(st.getId(),st);
        return st;
    }

    @override
    public List<Student> getAllStudents(){
        return new ArrayList<>(Store.values());
    }

    @override
    public Optional<Student> hetOne/student(Long id){
        return Optional.ofNullable(store.get(id));
    }

    @overridepublic void deleteStudent(Long id){
        store.remove(id);
    }
}