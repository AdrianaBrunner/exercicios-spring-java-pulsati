package com.example.PROJETOMERCADO.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "VENDAS_ADRIEXEMPLO")
public class vendaModel {

    @Id
    @Column(name = "ID_VENDA")
    private int idVenda;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "id_produto")
    private produtoModel idProduto;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id_cliente")
    private clienteModel idCliente;

    @NotBlank
    @Column(name = "DATA_VENDA")
    private Date dataVenda;

}
