package com.educasys.entitites;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class Person {

    private String name;
    private LocalDateTime birthDate;
    private String phone;
    private String address;
    private String email;

}
