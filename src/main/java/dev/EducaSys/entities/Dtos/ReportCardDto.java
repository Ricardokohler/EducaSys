package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.ClassRoom;
import dev.EducaSys.entities.Student;
import dev.EducaSys.entities.SubjectAverage;

import java.util.List;

public class ReportCardDto {

    private Long id;
    private Student student;
    private ClassRoom classRoom;
    private List<SubjectAverage> subjectAverageList;

    public ReportCardDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public List<SubjectAverage> getSubjectAverageList() {
        return subjectAverageList;
    }

    public void setSubjectAverageList(List<SubjectAverage> subjectAverageList) {
        this.subjectAverageList = subjectAverageList;
    }
}
