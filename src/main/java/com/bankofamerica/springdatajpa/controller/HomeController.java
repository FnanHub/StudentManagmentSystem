package com.bankofamerica.springdatajpa.controller;

import com.bankofamerica.springdatajpa.models.Student;
import com.bankofamerica.springdatajpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    IStudentService studentService;

    @GetMapping(value="/")
    public List<Student> home(){
        return studentService.getStudents();
    }
}
