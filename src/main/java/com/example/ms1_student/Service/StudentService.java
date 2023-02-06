package com.example.ms1_student.Service;

import com.example.ms1_student.entities.Student;
import java.util.*;
public interface StudentService {
    public Student getStudent(Long id);
    public List<Student> students();
    public Student saveStudent(Student student);
}
