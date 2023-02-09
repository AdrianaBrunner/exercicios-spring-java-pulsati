package com.example.APILIVROS.controller;

import com.example.APILIVROS.model.livrosModel;
import com.example.APILIVROS.repository.livrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/livros")
public class livrosController {

    @Autowired
    private livrosRepository repository;

    @GetMapping("/buscar")
    public List<livrosModel> buscarLivro(){
        return repository.findAll();
    }

    @GetMapping("/buscarPorTitulo")
    public livrosModel buscarPorTitulo(String TITULO){
        return repository.findByTITULO(TITULO);
    }

    @PostMapping("/adicionar")
    public livrosModel adicionarLivro(@RequestBody livrosModel livro){
        return repository.save(livro);
    }

    @PutMapping("/atualizar")
    public livrosModel atualizarLivro(@RequestBody livrosModel livro){
        return repository.save(livro);
    }

    @DeleteMapping("/remover")
    public void removerLivro(@RequestBody livrosModel livro){
        repository.delete(livro);
    }

}
