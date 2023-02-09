package com.example.APIPESSOA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "ADRI_PESSOA_JPA")
public class pessoaModel {

    @Id

    @NotBlank
    @Size(max = 100)
    @Column(name = "NOME")
    private String nome;

    @Range(min = 18)
    @Column(name = "IDADE")
    private int idade;

    @NotBlank
    @Email
    @Column(name = "EMAIL")
    private String email;
}
