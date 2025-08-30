package com.educasys.entitites;


import com.educasys.entitites.associations.Subject_Professor;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_professors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Subject - Many to Many
    @OneToMany(mappedBy = "id.professor")
    private Set<Subject_Professor> subjects = new HashSet<>();

}
