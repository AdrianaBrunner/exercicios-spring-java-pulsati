package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class tarefaModel {
    int id;
    String nome;
    String descriçao;
}
