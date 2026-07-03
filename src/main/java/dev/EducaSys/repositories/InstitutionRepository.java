package dev.EducaSys.repositories;

import dev.EducaSys.entities.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
}
