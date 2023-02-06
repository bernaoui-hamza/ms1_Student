package com.example.ms1_student.Service;

import com.example.ms1_student.Repositories.StudentRepository;
import com.example.ms1_student.entities.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional @NoArgsConstructor @AllArgsConstructor
public class StudentServiceImpl implements StudentService {
@Autowired
    StudentRepository studentRepository;
    @Override
    public Student getStudent(Long id) {
        Student st=studentRepository.findById(id).get();
        return st;
    }

    @Override
    public List<Student> students() {
        List<Student> listeStudent=studentRepository.findAll();
        return listeStudent;
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }
}
