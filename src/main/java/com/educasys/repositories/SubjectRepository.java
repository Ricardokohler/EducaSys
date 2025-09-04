package com.educasys.repositories;

import com.educasys.entitites.Professor;
import com.educasys.entitites.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
