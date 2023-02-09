package com.example.APIPESSOA.controller;

import com.example.APIPESSOA.model.pessoaModel;
import com.example.APIPESSOA.repository.pessoaRepository;
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
    public List<pessoaModel> buscar(){
        return repository.findAll();
    }

    @PostMapping("/add")
    public pessoaModel add(@RequestBody @Validated pessoaModel pessoa){
        return repository.save(pessoa);
    }

    @PutMapping("/update")
    public pessoaModel update(@RequestBody @Validated pessoaModel pessoa){
        return repository.save(pessoa);
    }

    @DeleteMapping("/delete/{NOME}")
    public void delete(String pessoa){
        repository.deleteByNome(pessoa);
    }


}
