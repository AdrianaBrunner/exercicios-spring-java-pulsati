package com.example.APITAREFA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "ADRI_TAREFAS_BCK")
@Entity
public class tarefaModel {
    @Id
    @Column(name = "ID_TAREFA")
    private int ID_TAREFA;
    @Column(name = "NOME_TAREFA")
    private String NOME_TAREFA;
    @Column(name = "DESCRICAO_TAREFA")
    private String DESCRICAO_TAREFA;
    @Column(name = "DATA_INICIO")
    private Date DATA_INICIO;
    @Column(name = "STATUS")
    private String STATUS;
    @Column(name = "PRIORIDADE")
    private int PRIORIDADE;
}
