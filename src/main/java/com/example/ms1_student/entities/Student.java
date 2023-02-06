package com.example.ms1_student.entities;

import com.example.ms1_student.Enums.Gender;
import com.example.ms1_student.Enums.Groupe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Student {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age ;
    private String email;
    private String tel;
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String niveauEtude;
    private String telParent;
    @Enumerated(EnumType.STRING)
    private Groupe groupe;


}
