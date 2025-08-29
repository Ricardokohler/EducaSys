package com.educasys.entitites;

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
@Table(name="tb_materias")
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

    //students - many to many
    @JsonIgnore
    @OneToMany(mappedBy = "id.subject")
    private Set<Subject_Student> students = new HashSet<>();


    //course - many to one
}
