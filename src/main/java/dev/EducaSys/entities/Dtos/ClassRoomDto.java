package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.ReportCard;
import java.util.List;

public class ClassRoomDto {

    private Long id;

    private Character letter;
    private Integer studentsNumber;
    private String shift;

    private List<ReportCard> reportCardList;

    public ClassRoomDto() {
    }

    public ClassRoomDto(Long id, Character letter, Integer studentsNumber, String shift) {
        this.id = id;
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
