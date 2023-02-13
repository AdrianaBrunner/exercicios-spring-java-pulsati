package com.example.APIPONTOJOIN.controller;


import com.example.APIPONTOJOIN.model.pessoaModel;
import com.example.APIPONTOJOIN.repository.pessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {
    @Autowired
    private pessoaRepository repository;

    @GetMapping("/buscar")
    public List<pessoaModel> buscar(){
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public pessoaModel buscarPorId(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public pessoaModel add(@RequestBody pessoaModel pessoa){
        return repository.save(pessoa);
    }

    @PutMapping("/update")
    public pessoaModel update(@RequestBody pessoaModel pessoa){
        return repository.save(pessoa);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        repository.deleteById(id);
    }

}
