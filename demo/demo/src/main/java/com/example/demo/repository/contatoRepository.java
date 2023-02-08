package com.example.demo.repository;

import com.example.demo.model.contatoModel;

import java.util.ArrayList;
import java.util.List;

public class contatoRepository {

    List<contatoModel> contatos = new ArrayList<contatoModel>();

    public contatoRepository() {
        contatos.add(new contatoModel(1, "Emanuel", "3333-6666"));
        contatos.add(new contatoModel(2, "Angela", "3333-4444"));
        contatos.add(new contatoModel(3, "Paula", "3333-9999"));
        contatos.add(new contatoModel(4, "Cristiano", "3333-1212"));
        contatos.add(new contatoModel(5, "Leopoldo", "3333-7878"));
        contatos.add(new contatoModel(6, "Juliana", "3333-4141"));
    }

    public void addContato(contatoModel contato) {
        contatos.add(contato);
    }

    public List<contatoModel> getContato() {
        return contatos;
    }

    public void deleteContato(contatoModel contato) {
        contatos.remove(contato);
    }

    public void updateContato(contatoModel contato) {
        for (contatoModel c : contatos) {
            if (c.getId() == contato.getId()) {
                c.setNome(contato.getNome());
                c.setFone(contato.getFone());
            }
        }
    }

    public contatoModel getContatoById(int id) {
        for (contatoModel c : contatos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
