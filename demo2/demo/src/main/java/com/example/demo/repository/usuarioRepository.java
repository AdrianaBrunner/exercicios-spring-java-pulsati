package com.example.demo.repository;

import com.example.demo.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {

    public usuarioModel findByCPF(String cpf);
    public List<usuarioModel> findByNOME(String NOME);
    @Query(value = "SELECT * FROM BCK_ADRI "+
        "WHERE NOME = ?1 AND SEXO = ?2 AND TIPO_SANGUINEO = ?3 ", nativeQuery = true)
    public List<usuarioModel> pesquisaPorCaracteristicas(String NOME, String SEXO, String TIPO_SANGUINEO);
    @Query(value = "SELECT * FROM BCK_ADRI WHERE upper(NOME) LIKE '%JAVA%'", nativeQuery = true)
    public List<usuarioModel> encontrarPessoaJava();

    @Query(value = "SELECT * FROM BCK_ADRI WHERE TRUNC((SYSDATE - DATA_NASCIMENTO) / 365) > 18", nativeQuery = true)
    public List<usuarioModel> findAll();
}
