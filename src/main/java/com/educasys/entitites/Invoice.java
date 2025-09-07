package com.educasys.entitites;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.jmx.export.annotation.ManagedMetric;

@Entity
@Table(name="tb_invoices")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String holder;

    @ManyToOne
    @JoinColumn(name = "id_invoice")
    private Invoice invoice;


}
