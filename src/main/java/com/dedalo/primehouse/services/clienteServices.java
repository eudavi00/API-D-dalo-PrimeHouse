package com.dedalo.primehouse.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

import com.dedalo.primehouse.models.clienteModels;
import com.dedalo.primehouse.repositories.clienteRepository;

@Service
public class clienteServices {

    @Autowired
    private clienteRepository repository;

    public List<clienteModels> findAll() {
        return repository.findAll();
    }

    @Transactional
    public clienteModels save(clienteModels cliente) {
        return repository.save(cliente);
    }
}