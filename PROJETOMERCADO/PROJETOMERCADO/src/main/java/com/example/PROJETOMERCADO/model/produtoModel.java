package com.example.PROJETOMERCADO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "PRODUTOS_ADRIEXEMPLO")
public class produtoModel {

    @Id
    @Column(name = "ID_PRODUTO")
    private Integer idProduto;

    @NotBlank
    @Column(name = "NOME")
    private String nome;

    @Range(min = 0)
    @Column(name = "PRECO")
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID_FORNECEDOR")
    private fornecedorModel idFornecedor;

}
