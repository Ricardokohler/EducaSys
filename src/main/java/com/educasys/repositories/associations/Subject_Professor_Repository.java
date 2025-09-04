package com.educasys.repositories.associations;

import com.educasys.entitites.associations.Subject_Course;
import com.educasys.entitites.associations.Subject_Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Subject_Professor_Repository extends JpaRepository<Subject_Professor, Long> {
}
