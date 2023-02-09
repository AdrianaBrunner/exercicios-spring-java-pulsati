package com.example.APILIVROS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ADRI_LIVROS")

public class livrosModel {
    @Id
    @Column(name = "TITULO")
    private String TITULO;
    @Column(name = "AUTOR")
    private String AUTOR;
    @Column(name = "ANO_PUBLICACAOO")
    private int ANO_PUBLICACAOO;
    @Column(name = "GENERO")
    private String GENERO;
}
