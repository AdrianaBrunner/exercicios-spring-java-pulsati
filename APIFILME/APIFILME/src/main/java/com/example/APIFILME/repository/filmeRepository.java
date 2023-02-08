package com.example.APIFILME.repository;

import com.example.APIFILME.model.filmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface filmeRepository extends JpaRepository<filmeModel, Integer> {

    @Query(value = "SELECT * FROM ADRI_FILMES_BCK "+
            "WHERE DATA_LANCAMENTO = ?1 ", nativeQuery = true)
    public List<filmeModel> findbyDATA_LANCAMENTO(int DATA_LANCAMENTO);

    @Query(value = "SELECT * FROM ADRI_FILMES_BCK WHERE PAIS_ORIGEM = ?1", nativeQuery = true)
    public List<filmeModel> findbyPAIS_ORIGEM(String PAIS_ORIGEM);

    @Query(value = "SELECT * FROM ADRI_FILMES_BCK ORDER BY QUANTIDADE_VENDAS DESC", nativeQuery = true)
    public List<filmeModel> findAll();
}
