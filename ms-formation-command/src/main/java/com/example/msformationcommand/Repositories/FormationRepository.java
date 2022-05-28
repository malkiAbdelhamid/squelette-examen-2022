package com.example.msformationcommand.Repositories;

import com.example.msformationcommand.StoredAggregate.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository
        extends  JpaRepository<Formation,Long> {
}
