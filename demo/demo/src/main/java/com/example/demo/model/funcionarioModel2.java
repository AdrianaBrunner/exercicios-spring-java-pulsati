package com.example.demo.model;

import lombok.AllArgsConstructor; //Criar um construtor do model
import lombok.Data;
@Data
@AllArgsConstructor
public class funcionarioModel2 {
        private int id;
        private String nome;
        private int idade;
        private int matricula;

}
