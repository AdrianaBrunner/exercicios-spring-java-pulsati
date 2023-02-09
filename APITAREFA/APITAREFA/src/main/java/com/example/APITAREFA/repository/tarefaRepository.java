package com.example.APITAREFA.repository;

import com.example.APITAREFA.model.tarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface tarefaRepository extends JpaRepository<tarefaModel, Integer> {

    @Query(value = "SELECT * FROM ADRI_TAREFAS_BCK WHERE UPPER(STATUS) = UPPER(?1)", nativeQuery = true)
    public List<tarefaModel> findBySTATUS(String STATUS);

    @Query(value = "SELECT * FROM ADRI_TAREFAS_BCK WHERE PRIORIDADE = ?1", nativeQuery = true)
    public List<tarefaModel> findByPRIORIDADE(int PRIORIDADE);

}
