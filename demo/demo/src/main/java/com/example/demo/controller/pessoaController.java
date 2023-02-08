package com.example.demo.controller;

import com.example.demo.model.pessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //anotação para indicar qual classe o navegador deve ficar observando.
public class pessoaController {
    @GetMapping("/pessoa")//anotação para indicar qual é a rota do tipo get que será acessada pelo localhost:8080/pessoa

    public ResponseEntity<List<pessoaModel>> pessoa() {
        //ResponseEntity é um objeto que será retornado.
        //List<pessoaModel> é o tipo de dado que será retornado.
        //O response transforma a lista em um objeto json com os dados;

        List<pessoaModel> pessoas = new ArrayList<>(); //cria a lista de pessoas.

        pessoas.add(new pessoaModel(1, "João", 20));//adiciona pessoas a lista usando o construtor
        pessoas.add(new pessoaModel(2, "Maria", 25));

        return ResponseEntity.ok(pessoas);//  da o retorno da lista de pessoas.
    }
}
