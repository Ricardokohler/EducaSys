package com.educasys.repositories;

import com.educasys.entitites.Institution;
import com.educasys.entitites.Invoice;
import com.educasys.entitites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
