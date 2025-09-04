package com.educasys.repositories;

import com.educasys.entitites.Coordinator;
import com.educasys.entitites.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
