package com.example.APITAREFA.controller;

import com.example.APITAREFA.model.tarefaModel;
import com.example.APITAREFA.repository.tarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class tarefaController {
    @Autowired
    private tarefaRepository repository;

    @GetMapping("/buscar")
    public List<tarefaModel> buscar() {
        return repository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public tarefaModel buscarPorId(@PathVariable int ID_TAREFA) {
        return repository.findById(ID_TAREFA).get();
    }

    @PutMapping("/atualizar")
    public tarefaModel atualizar(@RequestBody tarefaModel tarefa) {
        return repository.save(tarefa);
    }
    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int ID_TAREFA) {
        repository.deleteById(ID_TAREFA);
    }

    @PostMapping("/adicionar")
    public tarefaModel salvar(@RequestBody tarefaModel tarefa) {
        return repository.save(tarefa);
    }

    @GetMapping("/filtrarPorStatus/{STATUS}")
    public List<tarefaModel> filtrarPorStatus(@PathVariable String STATUS) {
        return repository.findBySTATUS(STATUS);
    }

    @GetMapping("/filtrarPorPrioridade/{PRIORIDADE}")
    public List<tarefaModel> filtrarPorStatus(@PathVariable int PRIORIDADE) {
        return repository.findByPRIORIDADE(PRIORIDADE);
    }

}
