package com.dedalo.primehouse.repositories;

import org.springframework.data.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedalo.primehouse.models.corretoresModels;


@Repository
public interface corretoresRepository extends JpaRepository<corretoresModels, Long> {
}

   