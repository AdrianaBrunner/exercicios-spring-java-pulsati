package com.example.APIPESSOA.repository;

import com.example.APIPESSOA.model.pessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoaRepository extends JpaRepository<pessoaModel, Integer> {

    void deleteByNome(String pessoa);
}
