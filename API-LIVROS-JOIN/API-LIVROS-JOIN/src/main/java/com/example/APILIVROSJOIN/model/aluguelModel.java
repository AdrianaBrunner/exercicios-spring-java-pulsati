package com.example.APILIVROSJOIN.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "ADRI_ALUGUEL_JPA")
public class aluguelModel {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "DATA_ALUGUEL")
    private Date dataAluguel;

    @ManyToOne
    @JoinColumn(name = "ID_LIVRO", referencedColumnName = "id")
    private livrosModel idLivro;
}
