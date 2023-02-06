package com.example.ms1_student;

import com.example.ms1_student.Enums.Gender;
import com.example.ms1_student.Enums.Groupe;
import com.example.ms1_student.Service.StudentService;
import com.example.ms1_student.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Ms1StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ms1StudentApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(StudentService studentService){
        return args -> {
            Student st1=studentService.saveStudent(
                    new Student(null,"ali",20,"ali@123.com","0618776655",new Date(), Gender.homme,"5IIR","06123456", Groupe.G4));
            Student st2=studentService.saveStudent(
                    new Student(null,"mouna",23,"mouna@123.com","0618776655",new Date(), Gender.femme,"4IIR","0612222", Groupe.G3));

        };
    }
}
