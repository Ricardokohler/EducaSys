package com.educasys.entitites;

import com.educasys.entitites.pk.Subject_Student_PK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_subject_averages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SubjectAverage {

    @JsonIgnore
    @EmbeddedId
    private Subject_Student_PK id = new Subject_Student_PK();

    @ManyToOne
    @JoinColumn(name="reportcard_id")
    private ReportCard reportCard;

    private Double nota1, nota2, nota3, media;

    public SubjectAverage(Subject subject, Student student, Double nota1, Double nota2, Double nota3, Double media) {
        id.setSubject(subject);
        id.setStudent(student);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public Student getStudent(){
        return id.getStudent();
    }

    public void setStudent(Student student){
        id.setStudent(student);
    }

    public Subject getSubject(){
        return id.getSubject();
    }

    public void setSubject(Subject subject){
        id.setSubject(subject);
    }
}
