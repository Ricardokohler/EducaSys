package com.educasys.repositories;

import com.educasys.entitites.Professor;
import com.educasys.entitites.SubjectAverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectAverageRepository extends JpaRepository<SubjectAverage, Long> {
}
