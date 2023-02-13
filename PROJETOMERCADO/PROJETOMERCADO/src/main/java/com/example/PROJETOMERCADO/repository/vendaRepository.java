package com.example.PROJETOMERCADO.repository;

import com.example.PROJETOMERCADO.model.vendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendaRepository extends JpaRepository<vendaModel, Integer> {
}
