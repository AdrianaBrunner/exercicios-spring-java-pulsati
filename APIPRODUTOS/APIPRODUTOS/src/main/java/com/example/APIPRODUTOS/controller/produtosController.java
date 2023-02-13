package com.example.APIPRODUTOS.controller;

import com.example.APIPRODUTOS.model.produtosModel;
import com.example.APIPRODUTOS.repository.produtosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class produtosController {

    @Autowired
    private produtosRepository repository;

    @GetMapping("/buscar")
    public List<produtosModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscarPorID/{ID_PRODUTO}")
    public produtosModel buscarPorID(@PathVariable int ID_PRODUTO) {
        return repository.findById(ID_PRODUTO).get();
    }

    @PostMapping("/adicionar")
    public produtosModel adicionar(@RequestBody @Validated produtosModel produto) {
            return repository.save(produto);
    }

    @PutMapping("/atualizar")
    public produtosModel atualizar(@RequestBody produtosModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/apagar/{ID_PRODUTO}")
    public void apagar(int ID_PRODUTO) {
        repository.deleteById(ID_PRODUTO);
    }

    @GetMapping("/buscarEstoqueMaiorQueZero/")
    public List<produtosModel> buscarEstoqueMaiorQueZero() {
        return repository.findAll();
    }

    @GetMapping("/buscarNomeComLike/{NOME_PRODUTO}")
    public List<produtosModel> buscarComLike(@PathVariable String NOME_PRODUTO) {
        return repository.encontrarComLike(NOME_PRODUTO);
    }

    @GetMapping("/buscarDescricaoComLike/{DESCRICAO_PRODUTO}")
    public List<produtosModel> buscarDescricaoComLike(@PathVariable String DESCRICAO_PRODUTO) {
        return repository.buscarDescricaoComLike(DESCRICAO_PRODUTO);
    }

    @GetMapping("/buscarCategoria/{CATEGORIA}")
    public List<produtosModel> buscarCategoria(@PathVariable String CATEGORIA) {
        return repository.findByCATEGORIA(CATEGORIA);
    }

    @GetMapping("/buscarFornecedor/{FORNECEDOR}")
    public List<produtosModel> buscarFornecedor(@PathVariable String FORNECEDOR) {
        return repository.findByFORNECEDOR(FORNECEDOR);
    }

    @GetMapping("/buscarFabricante/{FABRICANTE}")
    public List<produtosModel> buscarFabricante(@PathVariable String FABRICANTE) {
        return repository.findByFABRICANTE(FABRICANTE);
    }
}
