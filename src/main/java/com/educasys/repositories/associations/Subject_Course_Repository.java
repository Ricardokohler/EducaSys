package com.educasys.repositories.associations;

import com.educasys.entitites.associations.ClassRoom_Student;
import com.educasys.entitites.associations.Subject_Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Subject_Course_Repository extends JpaRepository<Subject_Course, Long> {
}
