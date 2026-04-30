package com.dedalo.primehouse.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalo.primehouse.models.imoveisModels;

@Repository
public interface imoveisRepository extends JpaRepository<imoveisModels, Long> {
}