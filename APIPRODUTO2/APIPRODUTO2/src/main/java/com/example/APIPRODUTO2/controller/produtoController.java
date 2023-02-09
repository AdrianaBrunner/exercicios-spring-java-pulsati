package com.example.APIPRODUTO2.controller;

import com.example.APIPRODUTO2.model.produtoModel;
import com.example.APIPRODUTO2.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class produtoController {

    @Autowired
    private produtoRepository repository;

    @GetMapping("/buscar")
    public List<produtoModel> buscar(){
        return repository.findAll();
    }

    @PostMapping("/add")
    public produtoModel add(@RequestBody @Validated produtoModel produto){
        return repository.save(produto);
    }

    @PutMapping("/update")
    public produtoModel update(@RequestBody @Validated produtoModel produto){
        return repository.save(produto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Validated produtoModel produto){
        repository.delete(produto);
    }
}
