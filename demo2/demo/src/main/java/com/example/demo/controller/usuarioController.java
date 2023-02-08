package com.example.demo.controller;

import com.example.demo.model.usuarioModel;
import com.example.demo.repository.usuarioRepository;
import jakarta.persistence.PostRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class usuarioController{

    @Autowired
    private usuarioRepository repository;

    @GetMapping("/buscar")
    public List<usuarioModel> buscarTodos() {
        return repository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public usuarioModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public usuarioModel atualizar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }

    @PostMapping("/salvar")
    public usuarioModel salvar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }
    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/buscarCPF/{CPF}")
    public usuarioModel buscarPorCPF(@PathVariable String CPF) {
        return repository.findByCPF(CPF);
    }

    @GetMapping("/buscarNome/{NOME}")
    public List<usuarioModel> buscarNome(@PathVariable String NOME) {
        return repository.findByNOME(NOME);
    }
    @GetMapping("/BuscarPessoaComNomeJava")
    public List<usuarioModel> buscarPessoaComNomeJava() {
        return repository.encontrarPessoaJava();
    }
    //NOME, SEXO, TIPO_SANGUINEO
    @GetMapping("/buscarComNomeSexoTipoSanguineo/{NOME}/{SEXO}/{TIPO_SANGUINEO}")
    public List<usuarioModel> buscarComNomeSexoTipoSanguineo(@PathVariable String NOME,
                                                             @PathVariable String SEXO,
                                                             @PathVariable String TIPO_SANGUINEO) {
        return repository.pesquisaPorCaracteristicas(NOME, SEXO, TIPO_SANGUINEO);
    }

    @GetMapping("/buscarPessoasMaiordeIdade")
    public List<usuarioModel> BuscarPessoasMaiordeIdade() {
        return repository.findAll();
    }
}
