package com.dedalo.primehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalo.primehouse.models.vendasModels;

@Repository
public interface vendasRepository extends JpaRepository<vendasModels, Long> {
}