package com.educasys.entitites.pk;

import com.educasys.entitites.Invoice;
import com.educasys.entitites.Student;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class Student_Invoice_PK {

    @ManyToOne
    private Student student;

    @ManyToOne
    private Invoice invoice;

}
