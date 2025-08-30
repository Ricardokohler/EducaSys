package com.educasys.entitites.associations;

import com.educasys.entitites.Professor;
import com.educasys.entitites.Subject;
import com.educasys.entitites.pk.Subject_Professor_PK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_Subject_Professor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Subject_Professor {

    @JsonIgnore
    @EmbeddedId
    private Subject_Professor_PK id = new Subject_Professor_PK();

    public Subject_Professor(Professor professor, Subject subject){
        id.setProfessor(professor);
        id.setSubject(subject);
    }

    public Professor getProfessor(){
        return id.getProfessor();
    }

    public void setProfessor(Professor professor){
        id.setProfessor(professor);
    }

    public Subject getSubject(){
        return id.getSubject();
    }


}
