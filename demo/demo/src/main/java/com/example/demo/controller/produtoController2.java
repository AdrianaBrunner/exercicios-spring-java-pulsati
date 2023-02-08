package com.example.demo.controller;

import com.example.demo.model.produtoModel2;
import com.example.demo.repository.produtoRepository2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class produtoController2 {

    private produtoRepository2 produtoRepository2 = new produtoRepository2();

    @GetMapping("/buscar")
    public ResponseEntity<List<produtoModel2>> getProdutos() {
        return ResponseEntity.ok(produtoRepository2.getProdutos());
    }

    @PostMapping("/adicionar")
    public void addProduto(@RequestBody produtoModel2 produto) {
        produtoRepository2.addProdutos(produto);
    }

    @DeleteMapping("/remover/{id}")
    public void deleteProduto(@RequestBody produtoModel2 produto) {
        produtoRepository2.deleteProdutos(produto);
    }

    @PutMapping("/atualizar")
    public void updateProduto(@RequestBody produtoModel2 produto) {
        produtoRepository2.updateProdutos(produto);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<produtoModel2> getProdutoById(@PathVariable int id) {
        return ResponseEntity.ok(produtoRepository2.getProdutoById(id));
    }
}
