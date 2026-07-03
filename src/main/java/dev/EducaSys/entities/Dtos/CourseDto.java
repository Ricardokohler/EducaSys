package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Coordinator;
import dev.EducaSys.entities.Subject;

import java.util.Set;

public class CourseDto {

    private Long id;
    private String name;
    private Integer hourTime;
    private Coordinator coordinator;

    private Set<Subject> subjectSet;

    public CourseDto() {
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
