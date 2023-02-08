package com.example.demo.model;

import lombok.Data;

@Data
public class produtoModel {
    int id;
    String nome;
    int preço;

    produtoModel(){}

    public produtoModel(int id, String nome, int preço){
        this.id=id;
        this.nome=nome;
        this.preço=preço;
    }
}
