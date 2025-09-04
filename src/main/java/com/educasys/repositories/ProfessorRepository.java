package com.educasys.repositories;

import com.educasys.entitites.Person;
import com.educasys.entitites.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
