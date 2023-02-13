package com.example.EXEMPLOJOIN.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "VENDAS_LUCAS")
public class vendaModel {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME_COMPRADOR")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private pessoaModel id_Pessoa;
}
