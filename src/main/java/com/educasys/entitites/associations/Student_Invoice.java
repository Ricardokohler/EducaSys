package com.educasys.entitites.associations;

import com.educasys.entitites.Invoice;
import com.educasys.entitites.Student;
import com.educasys.entitites.pk.Student_Invoice_PK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_Student_Invoice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student_Invoice {

    @EmbeddedId
    private Student_Invoice_PK id = new Student_Invoice_PK();

    public Student_Invoice(Invoice invoice, Student student){
        id.setInvoice(invoice);
        id.setStudent(student);
    }

    public void setStudent(Student student){
        id.setStudent(student);
    }

    public Student getStudent(){
        return id.getStudent();
    }

    public void setInvoice(Invoice invoice){
        id.setInvoice(invoice);
    }

    public Invoice getInvoice(){
        return id.getInvoice();
    }
}