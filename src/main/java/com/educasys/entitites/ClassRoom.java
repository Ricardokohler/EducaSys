package com.educasys.entitites;

import com.educasys.entitites.associations.ClassRoom_Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_classroom")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClassRoom {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shift;
    private char letter;
    private String semester;


    @JsonIgnore
    @OneToMany(mappedBy = "id.classRoom")
    private Set <ClassRoom_Student> students = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "ID_COURSE_FK")
    private Course course;
}
