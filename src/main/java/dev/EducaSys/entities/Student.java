package dev.EducaSys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "TB_STUDENTS")
public class Student extends Person{

    @OneToMany(mappedBy = "student")
    private List<Invoice> invoiceList;

    @OneToMany(mappedBy = "student")
    private List<ReportCard> reportCardList;

    public Student() {
    }

    public Student(Long id, String name, String phone, String address, String email, String cpf) {
        super(id, name, phone, address, email, cpf);
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public List<ReportCard> getReportCardList() {
        return reportCardList;
    }

    public void setReportCardList(List<ReportCard> reportCardList) {
        this.reportCardList = reportCardList;
    }
}
