package com.example.APICONTATOS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "ADRI_CONTATOS_BCK")
@Entity
public class contatosModel {
    @Id
    @Column(name = "ID_CONTATO")
    private int ID_CONTATO;
    @Column(name = "NOME")
    private String NOME;
    @Column(name = "EMAIL")
    private String EMAIL;
    @Column(name = "TELEFONE")
    private String TELEFONE;
    @Column(name = "ENDERECO")
    private String ENDERECO;
}
