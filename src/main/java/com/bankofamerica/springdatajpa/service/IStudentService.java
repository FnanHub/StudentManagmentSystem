package com.bankofamerica.springdatajpa.service;

import com.bankofamerica.springdatajpa.models.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getStudents();
}
