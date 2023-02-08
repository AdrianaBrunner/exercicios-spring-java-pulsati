package com.example.demo.controller;

import com.example.demo.model.funcionarioModel2;
import com.example.demo.repository.funcionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/funcionarios") //adiciona obrigatoriamente a url "funcionarios"
public class funcionarioController2 {
        private funcionarioRepository funcionarioRepository = new funcionarioRepository();
        @GetMapping("/buscar")
        public ResponseEntity<List<funcionarioModel2>> getFuncionarios() {
            return ResponseEntity.ok(funcionarioRepository.getFuncionarios());
        }

        @PostMapping("/adicionar")
        public void addFuncionario(@RequestBody funcionarioModel2 funcionario) {
            funcionarioRepository.addFuncionario(funcionario);
        }

        @DeleteMapping("/remover")
        public void deleteFuncionario(@RequestBody funcionarioModel2 funcionario) {
            funcionarioRepository.deleteFuncionario(funcionario);
        }

        @PutMapping("/atualizar")
        public void updateFuncionario(@RequestBody funcionarioModel2 funcionario) {
            funcionarioRepository.updateFuncionario(funcionario);
        }

        @GetMapping("/buscar/{id}")
        public ResponseEntity<funcionarioModel2> getFuncionariosById(@PathVariable int id) {
            return ResponseEntity.ok( funcionarioRepository.getFuncionariosById(id) );
        }
    }


