package com.example.PROJETOMERCADO.controller;

import com.example.PROJETOMERCADO.model.fornecedorModel;
import com.example.PROJETOMERCADO.model.produtoModel;
import com.example.PROJETOMERCADO.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/produto")
public class produtoController {
    @Autowired
    private produtoRepository repository;

    @GetMapping("/buscarProdutos")
    public List<produtoModel> buscarProdutos() {
        return repository.findAll();
    }

    @GetMapping("/buscarProdutoPorId/{id}")
    public produtoModel buscarProdutoPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/addProduto")
    public produtoModel addProduto(@RequestBody @Validated produtoModel produto) {
        return repository.save(produto);
    }

    @PutMapping("/updateProduto")
    public produtoModel updateProduto(@RequestBody @Validated produtoModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/deleteProduto/{id}")
    public void deleteProduto(@PathVariable int id) {
        repository.deleteById(id);
    }
}
