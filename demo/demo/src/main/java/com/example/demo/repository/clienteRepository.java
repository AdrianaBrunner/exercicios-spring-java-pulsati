package com.example.demo.repository;

import com.example.demo.model.clienteModel2;
import java.util.ArrayList;
import java.util.List;

public class clienteRepository {
    List<clienteModel2> clientes = new ArrayList<clienteModel2>();

    public clienteRepository() {
        clientes.add(new clienteModel2(1, "João", 28,123));
        clientes.add(new clienteModel2(2, "Maria", 30,456));
        clientes.add(new clienteModel2(3, "Pedro", 40,789));
        clientes.add(new clienteModel2(4, "Paulo", 26,987));
        clientes.add(new clienteModel2(5, "Claudia", 20,654));
    }
     public void addCliente(clienteModel2 cliente) {
         clientes.add(cliente);
     }

     public List<clienteModel2> getClientes() {
         return clientes;
     }

     public void deleteCliente(clienteModel2 cliente) {
         clientes.remove(cliente);
     }

     public void updateCliente(clienteModel2 cliente) {
         for(clienteModel2 c : clientes) {
            if(c.getId() == cliente.getId()) {
                c.setNome(cliente.getNome());
                c.setIdade(cliente.getIdade());
                c.setCodigoCadastro(cliente.getCodigoCadastro());
            }
         }
     }

     public clienteModel2 getClienteById(int id) {
         for(clienteModel2 c : clientes) {
             if(c.getId() == id){
                 return c;
             }
         }
         return null;
     }
}
