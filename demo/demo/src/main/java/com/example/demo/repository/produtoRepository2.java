package com.example.demo.repository;

import com.example.demo.model.produtoModel2;

import java.util.ArrayList;
import java.util.List;

public class produtoRepository2 {

    List<produtoModel2> produtos = new ArrayList<produtoModel2>();

    public produtoRepository2() {
        produtos.add(new produtoModel2(1, "Sabonete"));
        produtos.add(new produtoModel2(2, "Detergente"));
        produtos.add(new produtoModel2(3, "Desinfetante"));
        produtos.add(new produtoModel2(4, "Amaciante"));

    }

    public void addProdutos(produtoModel2 produto) {
        produtos.add(produto);
    }

    public List<produtoModel2> getProdutos() {
        return produtos;
    }

    public void deleteProdutos(produtoModel2 produto) {
        produtos.remove(produto);
    }

    public void updateProdutos(produtoModel2 produto) {
        for (produtoModel2 c : produtos) {
            if (c.getId() == produto.getId()) {
                c.setNome(produto.getNome());
            }
        }
    }

    public produtoModel2 getProdutoById(int id) {
        for (produtoModel2 c : produtos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}