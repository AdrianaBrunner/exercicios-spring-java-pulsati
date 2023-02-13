package com.example.APILIVROSJOIN.repository;

import com.example.APILIVROSJOIN.model.aluguelModel;
import com.example.APILIVROSJOIN.model.livrosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface livrosRepository extends JpaRepository<livrosModel, Integer> {
}
