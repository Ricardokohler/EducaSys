package com.educasys.repositories;

import com.educasys.entitites.ClassRoom;
import com.educasys.entitites.Coordinator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinatorRepository extends JpaRepository<Coordinator, Long> {
}
