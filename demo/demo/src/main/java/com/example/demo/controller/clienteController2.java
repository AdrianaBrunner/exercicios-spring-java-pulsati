package com.example.demo.controller;

import com.example.demo.model.clienteModel2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.clienteRepository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class clienteController2 {

    private clienteRepository clienteRepository = new clienteRepository();
    @GetMapping("/buscar")
    public ResponseEntity<List<clienteModel2>> getClientes() {
        return ResponseEntity.ok(clienteRepository.getClientes());
    }

    @PostMapping("/adicionar")
    public void addCliente(@RequestBody clienteModel2 cliente) {
        clienteRepository.addCliente(cliente);
    }

    @DeleteMapping("/remover")
    public void deleteCliente(@RequestBody clienteModel2 cliente) {
        clienteRepository.deleteCliente(cliente);
    }

    @PutMapping("/atualizar")
    public void updateCliente(@RequestBody clienteModel2 cliente) {
        clienteRepository.updateCliente(cliente);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<clienteModel2> getClienteById(@PathVariable int id) {
        return ResponseEntity.ok( clienteRepository.getClienteById(id) );
    }
}
