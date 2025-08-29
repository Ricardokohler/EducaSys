package com.educasys.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {



    private String name;
    private LocalDateTime birthDate;
    private String phone;
    private String address;
    private String email;


}
