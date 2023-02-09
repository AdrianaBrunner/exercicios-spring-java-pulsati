package com.example.APIPRODUTO2.repository;

import com.example.APIPRODUTO2.model.produtoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<produtoModel, Integer> {
}

