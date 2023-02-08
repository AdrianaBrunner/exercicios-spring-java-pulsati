package com.example.APIFILME.controller;

import com.example.APIFILME.model.filmeModel;
import com.example.APIFILME.repository.filmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")

public class filmeController {
    @Autowired
    private filmeRepository repository;

    @GetMapping("/buscar")
    public List<filmeModel> buscar() {
        return repository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public filmeModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public filmeModel atualizar(@RequestBody filmeModel filme) {
        return repository.save(filme);
    }
    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
    @PostMapping("/adicionar")
    public filmeModel salvar(@RequestBody filmeModel filme) {
        return repository.save(filme);
    }

    @GetMapping("/listarFilmesDoAno/{DATA_LANCAMENTO}")
    public List<filmeModel> listarFilmesDoAno(@PathVariable int DATA_LANCAMENTO) {
        return repository.findbyDATA_LANCAMENTO(DATA_LANCAMENTO);
    }
    @GetMapping("/filtrarFilmePorPais/{PAIS_ORIGEM}")
    public List<filmeModel> filtrarFilmePorPais(@PathVariable String PAIS_ORIGEM) {
        return repository.findbyPAIS_ORIGEM(PAIS_ORIGEM);
    }

    @GetMapping("/filtrarPorVendas")
    public List<filmeModel> filtrarPorVendas() {
        return repository.findAll();
    }
}
