package com.example.demo.model;
import lombok.Data;

@Data
public class fornecedorModel {
    int id;
    String nome;
    String cnpj;

    fornecedorModel() {
    }

    public fornecedorModel(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
