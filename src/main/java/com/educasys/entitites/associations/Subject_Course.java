package com.educasys.entitites.associations;

import com.educasys.entitites.Course;
import com.educasys.entitites.Subject;
import com.educasys.entitites.pk.Subject_Course_PK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_Subject_Course")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Subject_Course {


    @EmbeddedId
    private Subject_Course_PK id = new Subject_Course_PK();

    public Subject_Course(Subject subject, Course course){
        id.setSubject(subject);
        id.setCourse(course);
    }

    public void setSubject(Subject subject){
        id.setSubject(subject);
    }

    public Subject getSubject(){
        return id.getSubject();
    }

    public void setCourse(Course course){
        id.setCourse(course);
    }

    public Course getCourse(){
        return id.getCourse();
    }

}
