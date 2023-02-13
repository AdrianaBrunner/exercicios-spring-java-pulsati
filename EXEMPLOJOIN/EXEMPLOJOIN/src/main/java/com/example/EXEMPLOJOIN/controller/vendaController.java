package com.example.EXEMPLOJOIN.controller;

import com.example.EXEMPLOJOIN.model.vendaModel;
import com.example.EXEMPLOJOIN.repository.vendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venda")
public class vendaController {

    @Autowired
    private vendaRepository repository;

    @GetMapping("/buscar")
    public vendaModel buscar(){
        return repository.findAll().get(0);
    }
    @GetMapping("/buscar/{id}")
    public vendaModel buscarPorId(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public vendaModel add(@RequestBody @Validated vendaModel venda){
        return repository.save(venda);
    }

    @PutMapping("/update")
    public vendaModel update(@RequestBody @Validated vendaModel venda){
        return repository.save(venda);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(Long id){
        repository.deleteById(id);
    }
}
