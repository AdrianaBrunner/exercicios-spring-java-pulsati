package com.example.APILIVROSJOIN.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ADRI_LIVROS_JPA")
public class livrosModel {

    @Id
    @Column(name="ID")
    private int id;
    @Column(name="TITULO")
    private String titulo;
    @Column(name="AUTOR")
    private String autor;
    @Column(name="ANO_PUBLICACAO")
    private int anoPublicacao;

}
