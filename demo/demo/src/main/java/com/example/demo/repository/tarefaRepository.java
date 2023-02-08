package com.example.demo.repository;

import com.example.demo.model.tarefaModel;

import java.util.ArrayList;
import java.util.List;

public class tarefaRepository {

    List<tarefaModel> tarefas = new ArrayList<tarefaModel>();

    public tarefaRepository() {
        tarefas.add(new tarefaModel(1, "Varrer", "Varrer a casa"));
        tarefas.add(new tarefaModel(2, "Lavar", "Lavar louça"));
        tarefas.add(new tarefaModel(3, "Aspirar", "Aspirar tapete"));
        tarefas.add(new tarefaModel(4, "Remover", "Remover lixo"));

    }

    public void addTarefa(tarefaModel tarefa) {
        tarefas.add(tarefa);
    }

    public List<tarefaModel> getTarefas() {
        return tarefas;
    }

    public void deleteTarefas(tarefaModel tarefa) {
        tarefas.remove(tarefa);
    }

    public void updateTarefas(tarefaModel tarefa) {
        for (tarefaModel c : tarefas) {
            if (c.getId() == tarefa.getId()) {
                c.setNome(tarefa.getNome());
                c.setDescriçao(tarefa.getDescriçao());
            }
        }
    }

    public tarefaModel getTarefaById(int id) {
        for (tarefaModel c : tarefas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}