package com.example.PROJETOMERCADO.controller;


import com.example.PROJETOMERCADO.model.fornecedorModel;
import com.example.PROJETOMERCADO.repository.fornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class fornecedorController {
    @Autowired
    private fornecedorRepository repository;

    @GetMapping("/buscarFornecedor")
    public List<fornecedorModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarFornecedor/{id}")
    public fornecedorModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/addFornecedor")
    public fornecedorModel add(@RequestBody @Validated fornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    @PutMapping("/updateFornecedor")
    public fornecedorModel update(@RequestBody @Validated fornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    @DeleteMapping("/deleteFornecedor/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}


