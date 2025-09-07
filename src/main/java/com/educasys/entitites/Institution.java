package com.educasys.entitites;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long id;

    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "institution")
    private Set <Course> courses = new HashSet<>();

}
