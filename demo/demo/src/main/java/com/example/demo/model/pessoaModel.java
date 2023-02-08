package com.example.demo.model;

import lombok.Data;

import java.util.Locale;

@Data
public class pessoaModel {
    private int id;
    private String nome;
    private int idade;

    pessoaModel(){}
    public pessoaModel(int id, String nome, int idade){
        this.id=id;
        this.nome=nome;
        this.idade=idade;
    }
}
