package com.example.APICONTATOS.repository;

import com.example.APICONTATOS.model.contatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface contatosRepository extends JpaRepository<contatosModel, Integer> {

    @Query(value = "SELECT * FROM ADRI_CONTATOS_BCK WHERE UPPER(NOME) = UPPER(?1)", nativeQuery = true)
    public contatosModel findByNOME(String NOME);
}
