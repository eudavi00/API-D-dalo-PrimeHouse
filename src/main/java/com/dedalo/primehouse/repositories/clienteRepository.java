package com.dedalo.primehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalo.primehouse.models.clienteModels;


@Repository
public interface clienteRepository extends JpaRepository<clienteModels, Long> {
}