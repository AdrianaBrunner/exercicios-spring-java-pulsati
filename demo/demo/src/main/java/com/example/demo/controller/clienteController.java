package com.example.demo.controller;

import com.example.demo.model.clienteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class clienteController {
    @GetMapping("/cliente")

    public ResponseEntity<List<clienteModel>> cliente() {
        List<clienteModel> cliente = new ArrayList<>();

        cliente.add(new clienteModel(1, "Pedro", "000.111.222.333"));
        cliente.add(new clienteModel(2, "Ana", "111.111.222.333"));

        return ResponseEntity.ok(cliente);

    }
}
