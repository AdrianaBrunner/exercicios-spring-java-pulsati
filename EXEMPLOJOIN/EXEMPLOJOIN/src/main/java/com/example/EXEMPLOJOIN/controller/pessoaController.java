package com.example.EXEMPLOJOIN.controller;

import com.example.EXEMPLOJOIN.model.pessoaModel;
import com.example.EXEMPLOJOIN.repository.pessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {
    @Autowired
    private pessoaRepository repository;

    @GetMapping("/buscar")
    public List<pessoaModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public pessoaModel buscarPorId(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public pessoaModel add(@RequestBody @Validated pessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/update/{id}")
    public pessoaModel update(@PathVariable @Validated Long id, pessoaModel pessoa) {
        return repository.save(pessoa);
}
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
