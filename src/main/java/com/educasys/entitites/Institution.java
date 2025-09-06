package com.educasys.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_institutions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class  Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_course_pk;

    private String name;
    private String description;

    //Course One to Many
    @OneToMany(mappedBy = "institution")
    private Set <Course> courses = new HashSet<>();

}
