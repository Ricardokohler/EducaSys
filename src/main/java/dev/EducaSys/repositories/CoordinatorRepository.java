package dev.EducaSys.repositories;

import dev.EducaSys.entities.Coordinator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinatorRepository extends JpaRepository <Coordinator, Long> {
}
