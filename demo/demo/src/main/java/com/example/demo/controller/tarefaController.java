package com.example.demo.controller;

import com.example.demo.model.tarefaModel;
import com.example.demo.repository.tarefaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")

public class tarefaController {

    private tarefaRepository tarefaRepository = new tarefaRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<tarefaModel>> getTarefas() {
        return ResponseEntity.ok(tarefaRepository.getTarefas());
    }

    @PostMapping("/adicionar")
    public void addTarefa(@RequestBody tarefaModel tarefa) {
        tarefaRepository.addTarefa(tarefa);
    }

    @DeleteMapping("/remover")
    public void deleteTarefa(@RequestBody tarefaModel tarefa) {
        tarefaRepository.deleteTarefas(tarefa);
    }

    @PutMapping("/atualizar")
    public void updateTarefa(@RequestBody tarefaModel tarefa) {
        tarefaRepository.updateTarefas(tarefa);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<tarefaModel> getTarefaById(@PathVariable int id) {
        return ResponseEntity.ok(tarefaRepository.getTarefaById(id));
    }
}
