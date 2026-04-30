package com.dedalo.primehouse.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.dedalo.primehouse.repositories.imoveisRepository;

@Service
public class imoveisServices {

    @Autowired
    private imoveisRepository repository;

    public List<imoveisModels> findAll() {
        return repository.findAll();
    }

    public imoveisModels save(imoveisModels imovel) {
        return repository.save(imovel);
    }
}