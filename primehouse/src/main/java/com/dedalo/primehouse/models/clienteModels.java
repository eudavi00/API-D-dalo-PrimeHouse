package com.dedalo.primehouse.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class clienteModels implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    
    private String nome_cliente;
    private String cpf_cliente;
    private String telefone_cliente;
    private String email_cliente;

    // Getters e Setters
    public Long getId_cliente() 
    { return id_cliente; }

    public void setId_cliente(Long id_cliente)
     { this.id_cliente = id_cliente; }

    public String getNome_cliente() 
    { return nome_cliente; }

    public void setNome_cliente(String nome_cliente) 
    { this.nome_cliente = nome_cliente; }

    public String getCpf_cliente() 
    { return cpf_cliente; }

    public void setCpf_cliente(String cpf_cliente) 
    { this.cpf_cliente = cpf_cliente; }

    public String getTelefone_cliente()
    { return telefone_cliente; }
    public void setTelefone_cliente(String telefone_cliente) 
    { this.telefone_cliente = telefone_cliente; }

    public String getEmail_cliente()
    { return email_cliente; }
    public void setEmail_cliente(String email_cliente) 
    { this.email_cliente = email_cliente; }
}
