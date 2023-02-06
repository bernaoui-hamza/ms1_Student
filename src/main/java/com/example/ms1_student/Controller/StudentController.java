package com.example.ms1_student.Controller;


import com.example.ms1_student.Service.StudentService;
import com.example.ms1_student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(path = "/student/id")
    public Student getStudent(@PathVariable Long id){
       Student student= studentService.getStudent(id);
       return student;
    }
    @GetMapping(path = "/students")
    public List<Student> students(){
        return studentService.students();
    }


}
