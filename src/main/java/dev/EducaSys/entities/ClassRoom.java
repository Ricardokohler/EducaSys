package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_CLASSROOM")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String period;
    private Character letter;
    private String shift; //noturno,diurno
    private Integer studentsNumber;

    @OneToMany(mappedBy = "classRoom")
    private List<ReportCard> reportCardList;

    public ClassRoom() {
    }

    public ClassRoom(Long id, String period, Character letter, Integer studentsNumber, String shift) {
        this.id = id;
        this.period= period;
        this.letter = letter;
        this.studentsNumber = studentsNumber;
        this.shift = shift;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public Integer getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(Integer studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public List<ReportCard> getReportCardList() {
        return reportCardList;
    }

    public void setReportCardList(List<ReportCard> reportCardList) {
        this.reportCardList = reportCardList;
    }
}
