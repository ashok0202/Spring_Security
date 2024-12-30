package com.jsp.SpringSec.service;

import com.jsp.SpringSec.model.Student;
import com.jsp.SpringSec.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }


}
