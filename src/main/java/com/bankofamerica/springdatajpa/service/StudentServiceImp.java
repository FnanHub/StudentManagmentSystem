package com.bankofamerica.springdatajpa.service;

import com.bankofamerica.springdatajpa.models.Student;
import com.bankofamerica.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements IStudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
