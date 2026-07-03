package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.ReportCard;
import dev.EducaSys.entities.Subject;

public class SubjectAverageDto {

    private Long id;

    private Double note1;
    private Double note2;
    private Double note3;
    private Double finalGrade;

    private Subject subject;
    private ReportCard reportCard;

    public SubjectAverageDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNote1() {
        return note1;
    }

    public void setNote1(Double note1) {
        this.note1 = note1;
    }

    public Double getNote2() {
        return note2;
    }

    public void setNote2(Double note2) {
        this.note2 = note2;
    }

    public Double getNote3() {
        return note3;
    }

    public void setNote3(Double note3) {
        this.note3 = note3;
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

    public void setReportCard(ReportCard reportCard) {
        this.reportCard = reportCard;
    }
}
