package com.example.APILIVROSJOIN.controller;

import com.example.APILIVROSJOIN.model.livrosModel;
import com.example.APILIVROSJOIN.repository.livrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/livros")

public class livrosController{
    @Autowired
    private livrosRepository repository;

    @GetMapping("/buscar")
    public List<livrosModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public livrosModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public livrosModel add(@RequestBody @Validated livrosModel livro) {
        return repository.save(livro);
    }

    @PutMapping("/update/{id}")
    public livrosModel update(@PathVariable @Validated int id, livrosModel livro) {
        return repository.save(livro);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}


