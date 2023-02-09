package com.example.APILIVROS.repository;

import com.example.APILIVROS.model.livrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface livrosRepository extends JpaRepository<livrosModel, Integer> {

    @Query(value = "select * from adri_livros where upper(TITULO) = upper(?1)", nativeQuery = true)
    public livrosModel findByTITULO(String titulo);
}
