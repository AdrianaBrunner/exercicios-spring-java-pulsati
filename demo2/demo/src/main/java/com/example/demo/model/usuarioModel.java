package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "BCK_ADRI")
@Entity
public class usuarioModel {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "CPF")
    private String CPF;
    @Column(name = "SEXO")
    private String SEXO;
    @Column(name = "NOME")
    private String NOME;
    @Column(name = "DATA_NASCIMENTO")
    private Date DATA_NASCIMENTO;
    @Column(name = "TIPO_SANGUINEO")
    private String TIPO_SANGUINEO;
    @Column(name = "EMAIL")
    private String EMAIL;
}
