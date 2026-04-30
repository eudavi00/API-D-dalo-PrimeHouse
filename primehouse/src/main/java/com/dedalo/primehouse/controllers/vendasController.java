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

import com.dedalo.primehouse.models.vendasModels;
import com.dedalo.primehouse.services.VendasServices;


@RestController
@RequestMapping("/vendas")
public class vendasController {

    @Autowired
    private VendasServices service;

    @GetMapping
    public ResponseEntity<List<vendasModels>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<vendasModels> create(@RequestBody vendasModels venda) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(venda));
    }
}
