package com.example.demo.controller;

import com.example.demo.model.produtoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class produtoController {
    @GetMapping("/produto")

    public ResponseEntity<List<produtoModel>> produto() {

        List<produtoModel> produto = new ArrayList<>();

        produto.add(new produtoModel(1, "Shampoo", 15));
        produto.add(new produtoModel(2, "Condicionar", 18));

        return ResponseEntity.ok(produto);
    }
}
