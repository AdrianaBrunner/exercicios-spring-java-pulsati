package com.example.APIPRODUTOS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "ADRI_PRODUTOS_BCK")

public class produtosModel {
    @Id
    @Column(name = "ID_PRODUTO")
    private int ID_PRODUTO;

    @Length(min = 4, max = 100, message = "O produto tem que ter no mínimo 4 e no máximo 100 caracteres")
    @Column(name = "NOME_PRODUTO")
    private String NOME_PRODUTO;
    @Column(name = "DESCRICAO_PRODUTO")
    private String DESCRICAO_PRODUTO;

    @NotBlank(message = "É obrigatório preencher a categoria")
    @Column(name = "CATEGORIA")
    private String CATEGORIA;

    @Column(name = "FABRICANTE")
    private String FABRICANTE;
    @Column(name = "FORNECEDOR")
    private String FORNECEDOR;

    @Range(min = 0, message = "O preço precisa ser maior que 0")
    @Column(name = "PRECO_UNITARIO")
    private double PRECO_UNITARIO;

    @Size(min = 1)
    @Column(name = "UNIDADES_ESTOQUE")
    private int UNIDADES_ESTOQUE;

}
