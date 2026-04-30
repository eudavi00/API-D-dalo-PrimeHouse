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

import com.dedalo.primehouse.models.clienteModels;
import com.dedalo.primehouse.services.clienteServices;


@RestController
@RequestMapping("/clientes") // Rota para acessar no navegador/Insomnia
public class clienteController {

    @Autowired
    private clienteServices service;

    @GetMapping
    public ResponseEntity<List<clienteModels>> getAllClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<clienteModels> saveCliente(@RequestBody clienteModels cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cliente));
    }
}