package com.educasys.entitites;


import com.educasys.entitites.associations.ClassRoom_Student;
import com.educasys.entitites.associations.Subject_Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private Long id;


    @OneToMany(mappedBy = "id.student")
    private Set<Subject_Student> subjects = new HashSet<>();


    @JsonIgnore
    @OneToMany(mappedBy = "id.student")
    private Set <ClassRoom_Student> classRooms = new HashSet<>();


    @OneToMany(mappedBy = "student")
    private List<ReportCard> reportCards = new ArrayList<>();
    //Invoice - one to many



}
