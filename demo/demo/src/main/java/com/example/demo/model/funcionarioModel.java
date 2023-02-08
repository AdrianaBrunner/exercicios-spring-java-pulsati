package com.example.demo.model;
import lombok.Data;

@Data
public class funcionarioModel {
    int id;
    String nome;
    String cpf;

    funcionarioModel(){}

    public funcionarioModel(int id, String nome, String cpf){
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
    }
}
