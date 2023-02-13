package com.example.PROJETOMERCADO.controller;

import com.example.PROJETOMERCADO.model.vendaModel;
import com.example.PROJETOMERCADO.repository.vendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class vendaController {
    @Autowired
    private vendaRepository repository;

    @GetMapping("/buscar    Venda")
    public List<vendaModel> buscarVenda() {
        return repository.findAll();
    }

    @GetMapping("/buscarVendaPorId/{id}")
    public vendaModel buscarVendaPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/addVenda")
    public vendaModel addVenda(@RequestBody @Validated vendaModel venda) {
        return repository.save(venda);
    }

    @PutMapping("/atualizarVenda")
    public vendaModel atualizarVenda(@RequestBody @Validated vendaModel venda) {
        return repository.save(venda);
    }

    @DeleteMapping("/deletarVenda/{id}")
    public void deletarVenda(@PathVariable int id) {
        repository.deleteById(id);
    }
}
