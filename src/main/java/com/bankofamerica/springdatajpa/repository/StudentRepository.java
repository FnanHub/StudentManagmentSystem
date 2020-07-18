package com.bankofamerica.springdatajpa.repository;

import com.bankofamerica.springdatajpa.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
