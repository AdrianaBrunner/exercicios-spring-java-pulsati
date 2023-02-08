package com.example.demo.controller;

import com.example.demo.model.contatoModel;
import com.example.demo.repository.contatoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")

public class contatoController {

    private contatoRepository contatoRepository = new contatoRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<contatoModel>> getContato() {
        return ResponseEntity.ok(contatoRepository.getContato());
    }

    @PostMapping("/adicionar")
    public void addContato(@RequestBody contatoModel contato) {
        contatoRepository.addContato(contato);
    }

    @DeleteMapping("/remover")
    public void deleteContato(@RequestBody contatoModel contato) {
        contatoRepository.deleteContato(contato);
    }

    @PutMapping("/atualizar")
    public void updateContato(@RequestBody contatoModel contato) {
        contatoRepository.updateContato(contato);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<contatoModel> getContatoById(@PathVariable int id) {
        return ResponseEntity.ok(contatoRepository.getContatoById(id));
    }
}
