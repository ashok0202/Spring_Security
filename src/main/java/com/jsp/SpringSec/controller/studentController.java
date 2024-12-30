package com.jsp.SpringSec.controller;


import com.jsp.SpringSec.model.Student;
import com.jsp.SpringSec.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class studentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String getSpring(){
        return "Hello My Spring boot"; 
    }

    @GetMapping("/students")
    public List<Student> getAllstudent(){
        return studentService.getAllStudent();

    }


}
