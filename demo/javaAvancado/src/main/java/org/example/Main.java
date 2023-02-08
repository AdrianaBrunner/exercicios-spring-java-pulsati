package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    static List<pessoa> pessoas = new ArrayList<>();

static{
    pessoas.add(new pessoa("João", 28));
    pessoas.add(new pessoa("Pedro", 30));
    pessoas.add(new pessoa("Paulo", 40));
}
    public static Optional<pessoa> encontrarPessoaPorIdade(int idade){
        for(pessoa p : pessoas){
            if(p.idade == idade){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
    Optional<pessoa> pessoa = encontrarPessoaPorIdade(idade);

    if(pessoa.isPresent()){
        JOptionPane.showMessageDialog(null, pessoa.get().nome);
    }else{
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
    }
    }
}

class pessoa{
    pessoa(){}
    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    String nome;
    int idade;
}