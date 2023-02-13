package com.example.APILIVROSJOIN.controller;

import com.example.APILIVROSJOIN.model.aluguelModel;
import com.example.APILIVROSJOIN.repository.aluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluguel")
public class aluguelController {

    @Autowired
    private aluguelRepository repository;

    @GetMapping("/buscar")
    public List<aluguelModel> buscar(){
        return repository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public aluguelModel buscarPorId(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PostMapping("/add")
    public aluguelModel add(@RequestBody @Validated aluguelModel aluguel){
        return repository.save(aluguel);
    }

    @PutMapping("/update")
    public aluguelModel update(@RequestBody @Validated aluguelModel aluguel){
        return repository.save(aluguel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(int id){
        repository.deleteById(id);
    }
}
