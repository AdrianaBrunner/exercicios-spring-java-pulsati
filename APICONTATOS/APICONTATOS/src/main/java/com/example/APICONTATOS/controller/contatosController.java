package com.example.APICONTATOS.controller;

import com.example.APICONTATOS.model.contatosModel;
import com.example.APICONTATOS.repository.contatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class contatosController {

    @Autowired
    private contatosRepository repository;

    @GetMapping("/buscar")
    public List<contatosModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{ID_CONTATO}")
    public contatosModel buscarPorId(@PathVariable int ID_CONTATO) {
        return repository.findById(ID_CONTATO).get();
    }

    @PostMapping("/adicionar")
    public contatosModel adicionar(@RequestBody contatosModel contatos) {
        return repository.save(contatos);
    }

    @PutMapping("/atualizar")
    public contatosModel atualizar(@RequestBody contatosModel contatos) {
        return repository.save(contatos);
    }

    @DeleteMapping("/remover/{ID_CONTATO}")
    public void remover(@PathVariable int ID_CONTATO) {
        repository.deleteById(ID_CONTATO);
    }

    @GetMapping("/buscarPorNome/{NOME}")
    public contatosModel buscarPorNome(@PathVariable String NOME) {
        return repository.findByNOME(NOME);
    }
}
