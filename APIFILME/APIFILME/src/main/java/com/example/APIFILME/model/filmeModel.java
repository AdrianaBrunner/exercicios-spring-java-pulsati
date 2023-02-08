package com.example.APIFILME.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name = "ADRI_FILMES_BCK")
@Entity
public class filmeModel {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "NOME")
    private String NOME;
    @Column(name = "DESCRICAO")
    private String DESCRICAO;
    @Column(name = "DATA_LANCAMENTO")
    private int DATA_LANCAMENTO;
    @Column(name = "QUANTIDADE_VENDAS")
    private int QUANTIDADE_VENDAS;
    @Column(name = "PAIS_ORIGEM")
    private String PAIS_ORIGEM;
}
