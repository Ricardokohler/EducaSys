package com.educasys.entitites;


import com.educasys.entitites.associations.ClassRoom_Student;
import com.educasys.entitites.associations.Subject_Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tb_Alunos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_student;

    //Subject - Many to many

    @OneToMany(mappedBy = "id.student")
    private Set<Subject_Student> subjects = new HashSet<>();


    @JsonIgnore
    @OneToMany(mappedBy = "id.student")
    private Set <ClassRoom_Student> classRooms = new HashSet<>();

    //Invoice - one to many



}
