package com.educasys.entitites;

import com.educasys.entitites.associations.ClassRoom_Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_classRoom")
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom {
    private static final long serialVersionId = 1L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_classRoom;

    private String shift;
    private char leter;


    //one to many student
    @OneToMany(mappedBy = "id.classRoom")
    private Set <ClassRoom_Student> students = new HashSet<>();




    //course - many to one
}
