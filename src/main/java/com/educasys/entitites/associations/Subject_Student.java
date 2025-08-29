package com.educasys.entitites.associations;

import com.educasys.entitites.Student;
import com.educasys.entitites.Subject;
import com.educasys.entitites.pk.Subject_Student_PK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_Subject_Student")
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Subject_Student {

    @JsonIgnore
    @EmbeddedId
    private Subject_Student_PK id = new Subject_Student_PK();

    public Subject_Student(Subject subject, Student student) {

    }

    public void setStudent(Student student){
        id.setStudent(student);
    }

    public Student getStudent(){
        return id.getStudent();
    }

    public void setSubject(Subject subject){
        id.setSubject(subject);
    }

    public Subject getSubject(Subject subject){
        return id.getSubject();
    }
}
