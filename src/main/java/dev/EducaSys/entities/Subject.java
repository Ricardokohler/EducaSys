package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer totalHours;


    @OneToMany(mappedBy = "subject")
    private List<SubjectAverage> subjectAverageList;

    @ManyToMany
    @JoinTable(name = "TB_SUBJECT_PROFESSOR", joinColumns = @JoinColumn(name= "ID_SUBJECT"), inverseJoinColumns = @JoinColumn(name = "ID_PROFESSOR"))
    private Set<Professor> professorSet;

    @ManyToMany(mappedBy = "subjectSet")
    public Set <Course> courseSet;

    public Subject() {
    }

    public Subject(Long id, String name, Integer totalHours) {
        this.id = id;
        this.name = name;
        this.totalHours = totalHours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
    }

    public List<SubjectAverage> getSubjectAverageList() {
        return subjectAverageList;
    }

    public void setSubjectAverageList(List<SubjectAverage> subjectAverageList) {
        this.subjectAverageList = subjectAverageList;
    }

    public Set<Professor> getProfessorSet() {
        return professorSet;
    }

    public void setProfessorSet(Set<Professor> professorSet) {
        this.professorSet = professorSet;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }
}
