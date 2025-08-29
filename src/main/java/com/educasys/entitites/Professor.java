package com.educasys.entitites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_professors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_professor;


}
