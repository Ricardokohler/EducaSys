package com.educasys.repositories;

import com.educasys.entitites.Coordinator;
import com.educasys.entitites.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
