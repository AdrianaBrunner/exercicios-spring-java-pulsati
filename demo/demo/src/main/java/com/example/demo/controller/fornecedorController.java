package com.example.demo.controller;

import com.example.demo.model.fornecedorModel;
import com.example.demo.model.produtoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class fornecedorController {
    @GetMapping("/fornecedor")

    public ResponseEntity<List<fornecedorModel>> fornecedor() {

        List<fornecedorModel> fornecedor = new ArrayList<>();

        fornecedor.add(new fornecedorModel(1, "Industria", "15.698.852/0001-52"));
        fornecedor.add(new fornecedorModel(2, "Comercio", "18.874.123/0002-33"));

        return ResponseEntity.ok(fornecedor);
    }
}
