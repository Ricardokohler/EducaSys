package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Student;

import java.time.LocalDateTime;
public class InvoiceDto {

    private Long id;

    private LocalDateTime expeditionDate;
    private LocalDateTime expirationDate;
    private Double amount;

    private Student student;

    public InvoiceDto() {
    }

    public InvoiceDto(Long id, LocalDateTime expeditionDate, LocalDateTime expirationDate, Double amount, Student student) {
        this.id = id;
        this.expeditionDate = expeditionDate;
        this.expirationDate = expirationDate;
        this.amount = amount;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getExpeditionDate() {
        return expeditionDate;
    }

    public void setExpeditionDate(LocalDateTime expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
