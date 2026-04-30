package com.models;

public class imoveis {
                private String id;
                private String endereco;
                private String tipo;
                private double preco;

                public imoveis(String id, String endereco, String tipo, double preco) {
                    this.id = id;
                    this.endereco = endereco;
                    this.tipo = tipo;
                    this.preco = preco;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getEndereco() {
                    return endereco;
                }

                public void setEndereco(String endereco) {
                    this.endereco = endereco;
                }

                public String getTipo() {
                    return tipo;
                }

                public void setTipo(String tipo) {
                    this.tipo = tipo;
                }

                public double getPreco() {
                    return preco;
                }

                public void setPreco(double preco) {
                    this.preco = preco;
                }
}
