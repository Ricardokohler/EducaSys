package com.educasys.entitites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_invoices")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_invoice_pk;

    private Double amount;
    private String holder;

    //many to one - Student


}
