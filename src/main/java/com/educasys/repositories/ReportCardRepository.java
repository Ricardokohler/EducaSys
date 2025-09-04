package com.educasys.repositories;

import com.educasys.entitites.Professor;
import com.educasys.entitites.ReportCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportCardRepository extends JpaRepository<ReportCard, Long> {
}
