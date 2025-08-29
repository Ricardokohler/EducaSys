package com.educasys.entitites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_coordinators")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coordinator extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_coordinator;

}
