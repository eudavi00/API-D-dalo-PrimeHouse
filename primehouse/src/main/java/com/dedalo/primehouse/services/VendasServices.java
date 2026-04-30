package com.dedalo.primehouse.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dedalo.primehouse.models.vendasModels;
import com.dedalo.primehouse.repositories.vendasRepository;

@Service
public class VendasServices {

    @Autowired
    private vendasRepository repository;

    public List<vendasModels> findAll() {
        return repository.findAll();
    }

    public vendasModels save(vendasModels venda) {
        return repository.save(venda);
    }
}