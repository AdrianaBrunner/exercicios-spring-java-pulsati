package com.example.APIPRODUTO2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "ADRI_PRODUTO_JPA")
public class produtoModel {

    @Id

    @NotBlank
    @Size(max = 100)
    @Column(name = "NOME")
    private String nome;

    @NotNull
    @Range(min = 0)
    @Column(name = "PRECO")
    private double preco;

    @Size(max = 250)
    @Column(name = "DESCRICAO")
    private String descricao;
}
