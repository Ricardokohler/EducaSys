package dev.EducaSys.entities.Dtos;

import dev.EducaSys.entities.Invoice;
import dev.EducaSys.entities.ReportCard;
import java.util.List;
public class StudentDto {

    private Long id;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String cpf;

    private List<Invoice> invoiceList;
    private List<ReportCard> reportCardList;

    public StudentDto() {
    }

    public StudentDto(Long id, String name, String phone, String address, String email, String cpf) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.cpf = cpf;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
