package com.example.PROJETOMERCADO.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTES_ADRIEXEMPLO")
public class clienteModel {

    @Id
    @Column(name = "ID_CLIENTE")
    private int idCliente;

    @NotBlank
    @Column(name = "NOME")
    private String nome;

    @NotBlank
    @Column(name = "ENDERECO")
    private String endereco;

    @Size(min = 8, max =12)
    @Column(name = "TELEFONE")
    private String telefone;
}
