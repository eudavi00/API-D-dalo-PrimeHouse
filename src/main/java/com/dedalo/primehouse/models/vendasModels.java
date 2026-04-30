package com.dedalo.primehouse.models;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendas")
public class vendasModels implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venda;

    @ManyToOne
    @JoinColumn(name = "imovel_id")
    private imoveisModels imovel;

    @ManyToOne
    @JoinColumn(name = "comprador_id")
    private clienteModels comprador;

    @ManyToOne
    @JoinColumn(name = "corretor_id")
    private corretoresModels corretor;

    private LocalDate data_venda;

    // Getters e Setters
    public Long getId_venda()
    { return id_venda; }
    
    public void setId_venda(Long id_venda) 
    { this.id_venda = id_venda; }

    public imoveisModels getImovel()
     { return imovel; }
    
     public void setImovel(imoveisModels imovel)
     { this.imovel = imovel; }

    public clienteModels getComprador()
    { return comprador; }
    
    public void setComprador(clienteModels comprador)
    { this.comprador = comprador; }

    public corretoresModels getCorretor()
     { return corretor; }

    public void setCorretor(corretoresModels corretor)
    { this.corretor = corretor; }

    public LocalDate getData_venda()
    { return data_venda; }

    public void setData_venda(LocalDate data_venda)
    { this.data_venda = data_venda; }
}