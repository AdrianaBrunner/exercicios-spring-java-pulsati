package com.example.demo.repository;

import com.example.demo.model.funcionarioModel2;
import java.util.ArrayList;
import java.util.List;

public class funcionarioRepository {

        List<funcionarioModel2> funcionarios = new ArrayList<funcionarioModel2>(); //criar lista de funcionarios

        public funcionarioRepository() { //método para add funcionarios a lista, usando construtor criado no model
            funcionarios.add(new funcionarioModel2(1, "Claudio", 28,123));
            funcionarios.add(new funcionarioModel2(2, "Jonas", 30,456));
            funcionarios.add(new funcionarioModel2(3, "Cristofer", 40,789));
            funcionarios.add(new funcionarioModel2(4, "Fernando", 26,987));
            funcionarios.add(new funcionarioModel2(5, "Gleice", 20,654));
        }
        public void addFuncionario(funcionarioModel2 funcionario) { //metodo para add funcionarios
            funcionarios.add(funcionario);
        }

        public List<funcionarioModel2> getFuncionarios() { //metodo para listar todos os funcionarios
            return funcionarios;
        }

        public void deleteFuncionario(funcionarioModel2 funcionario) { //metodo para deletar funcionario
            funcionarios.remove(funcionario);
        }

        public void updateFuncionario(funcionarioModel2 funcionario) { //metodo para atualizar funcionario
            for(funcionarioModel2 f : funcionarios) {
                if(f.getId() == funcionario.getId()) {
                    f.setNome(funcionario.getNome());
                    f.setIdade(funcionario.getIdade());
                    f.setMatricula(funcionario.getMatricula());
                }
            }
        }

        public funcionarioModel2 getFuncionariosById(int id) { //metodo para buscar funcionario especifico
            for(funcionarioModel2 f : funcionarios) {
                if(f.getId() == id){
                    return f;
                }
            }
            return null;
        }
    }


