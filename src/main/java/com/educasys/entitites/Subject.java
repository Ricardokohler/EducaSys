package com.educasys.entitites;

import com.educasys.entitites.associations.Subject_Course;
import com.educasys.entitites.associations.Subject_Professor;
import com.educasys.entitites.associations.Subject_Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_subjects")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer hourTime;

    //Students - Many to Many
    @JsonIgnore
    @OneToMany(mappedBy = "id.subject")
    private Set<Subject_Student> students = new HashSet<>();

    //Professor - Many to Many
    @OneToMany(mappedBy = "id.subject")
    private Set <Subject_Professor> professors = new HashSet<>();

    //Course - Many to Many
    @OneToMany(mappedBy = "id.subject")
    private Set <Subject_Course> courses = new HashSet<>();

}
