package com.example.PROJETOMERCADO.repository;

import com.example.PROJETOMERCADO.model.produtoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<produtoModel, Integer> {
}
