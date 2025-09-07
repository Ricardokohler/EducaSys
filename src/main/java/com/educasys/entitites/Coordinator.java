package com.educasys.entitites;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_coordinator")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coordinator extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_coordinator;


    @JsonIgnore
    @OneToOne(mappedBy = "coordinator")
    private Course course;
}
