package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Course;
import dev.EducaSys.entities.Professor;
import dev.EducaSys.entities.SubjectAverage;

import java.util.List;
import java.util.Set;

public class SubjectDto {

    private Long id;
    private String name;
    private Integer totalHours;
    private List<SubjectAverage> subjectAverageList;
    private Set<Professor> professorSet;
    private Set<Course> courseSet;

    public SubjectDto() {
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
