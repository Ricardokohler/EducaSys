package dev.EducaSys.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_INVOICES")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime expeditionDate;
    private LocalDateTime expirationDate;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "Id_Student")
    private Student student;

    public Invoice() {
    }

    public Invoice(Long id, LocalDateTime expeditionDate, LocalDateTime expirationDate, Double amount) {
        this.id = id;
        this.expeditionDate = expeditionDate;
        this.expirationDate = expirationDate;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
