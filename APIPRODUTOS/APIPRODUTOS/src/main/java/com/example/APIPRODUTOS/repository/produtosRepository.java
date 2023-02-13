package com.example.APIPRODUTOS.repository;

import com.example.APIPRODUTOS.model.produtosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface produtosRepository extends JpaRepository<produtosModel, Integer> {


    @Query(value = "select * from ADRI_PRODUTOS_BCK WHERE UNIDADES_ESTOQUE > 0", nativeQuery = true)
    public List<produtosModel> findAll();

    @Query(value = "select * from ADRI_PRODUTOS_BCK WHERE UPPER(NOME_PRODUTO) LIKE 'A%'", nativeQuery = true)
    public List<produtosModel> encontrarComLike(String NOME_PRODUTO);

    @Query(value = "select * from ADRI_PRODUTOS_BCK WHERE UPPER(DESCRICAO_PRODUTO) LIKE 'A%'", nativeQuery = true)
    public List<produtosModel> buscarDescricaoComLike(String DESCRICAO_PRODUTO);

    public List<produtosModel> findByCATEGORIA(String CATEGORIA);

    public List<produtosModel> findByFORNECEDOR(String FORNECEDOR);

    public List<produtosModel> findByFABRICANTE(String FABRICANTE);
}
