package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "TB_COURSES")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer hourTime;

    @OneToOne
    private Coordinator coordinator;

    @ManyToMany
    @JoinTable(name = "TB_SUBJECT_COUSE", joinColumns = @JoinColumn(name = "ID_COURSE"), inverseJoinColumns = @JoinColumn(name = "ID_SUBJECT"))
    private Set<Subject> subjectSet;

    public Course(){
    }

    public Course(Long id, String name, Integer hourTime) {
        this.id = id;
        this.name = name;
        this.hourTime = hourTime;
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

    public Integer getHourTime() {
        return hourTime;
    }

    public void setHourTime(Integer hourTime) {
        this.hourTime = hourTime;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public void setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
    }
}
