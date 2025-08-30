package com.educasys.entitites;

import com.educasys.entitites.associations.ClassRoom_Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_classroom")
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shift;
    private char leter;
    private String semester;

    //Student - One to Many
    @OneToMany(mappedBy = "id.classRoom")
    private Set <ClassRoom_Student> students = new HashSet<>();

    //Course - Many to One
    @ManyToOne
    @JoinColumn(name = "Course_id_FK")
    private Course course;
}
