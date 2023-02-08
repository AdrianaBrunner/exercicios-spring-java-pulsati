package com.example.demo.model;

import lombok.Data;

@Data
public class clienteModel {
    int id;
    String nome;
    String cpf;

    clienteModel(){}

    public clienteModel(int id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}
