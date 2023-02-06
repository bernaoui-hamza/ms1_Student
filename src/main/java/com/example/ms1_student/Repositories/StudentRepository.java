package com.example.ms1_student.Repositories;

import com.example.ms1_student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
