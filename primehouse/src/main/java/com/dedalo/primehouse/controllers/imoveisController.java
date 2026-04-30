package com.dedalo.primehouse.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dedalo.primehouse.models.imoveisModels;
import com.dedalo.primehouse.services.imoveisServices;


@RestController
@RequestMapping("/imoveis") // Rota para gerenciar o inventário de imóveis
public class imoveisController {

    @Autowired
    private imoveisServices service;

    // Listar todos os imóveis
    @GetMapping
    public ResponseEntity<List<imoveisModels>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    // Cadastrar um novo imóvel
    @PostMapping
    public ResponseEntity<imoveisModels> create(@RequestBody imoveisModels imovel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(imovel));
    }
}