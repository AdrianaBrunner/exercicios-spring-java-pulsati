package com.example.PROJETOMERCADO.controller;

import com.example.PROJETOMERCADO.model.clienteModel;
import com.example.PROJETOMERCADO.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteRepository repository;

    @GetMapping("/buscarCliente")
    public List<clienteModel> buscarCliente() {
        return repository.findAll();
    }

    @GetMapping("/buscarClientePorId/{id}")
    public clienteModel buscarClientePorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/addCliente")
    public clienteModel addCliente(@RequestBody @Validated clienteModel cliente) {
        return repository.save(cliente);
    }

    @PutMapping("/updateCliente")
    public clienteModel updateCliente(@RequestBody @Validated clienteModel cliente) {
        return repository.save(cliente);
    }

    @DeleteMapping("/deleteCliente/{id}")
    public void deleteCliente(@PathVariable int id) {
        repository.deleteById(id);
    }

}
