package com.dedalo.primehouse.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalo.primehouse.models.corretoresModels;
import com.dedalo.primehouse.repositories.corretoresRepository;

import jakarta.transaction.Transactional;

@Service
public class corretoresServices {

    @Autowired
    private corretoresRepository repository;

    public List<corretoresModels> findAll() {
        return repository.findAll();
    }

    @Transactional
    public corretoresModels save(corretoresModels corretor) {
        return repository.save(corretor);
    }
}