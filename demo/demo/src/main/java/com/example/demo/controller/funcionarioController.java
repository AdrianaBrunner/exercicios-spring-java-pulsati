package com.example.demo.controller;

import com.example.demo.model.funcionarioModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class funcionarioController {

    @GetMapping("/funcionario")

    public ResponseEntity<List<funcionarioModel>> funcionario() {

        List<funcionarioModel> funcionario = new ArrayList<>();

        funcionario.add(new funcionarioModel(1, "Cristian", "123.456.789-00"));
        funcionario.add(new funcionarioModel(2, "Jonas", "123.569.897-96"));

        return ResponseEntity.ok(funcionario);
    }
}
