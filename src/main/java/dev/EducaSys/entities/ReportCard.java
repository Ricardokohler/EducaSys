package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_REPORT_CARDS")
public class ReportCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_classroom")
    private ClassRoom classRoom;

    @OneToMany(mappedBy = "reportCard")
    private List<SubjectAverage> subjectAverageList;

    public ReportCard() {
    }

    public ReportCard(Long id) {
        this.id = id;
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
