package com.example.stockmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.stockmanager.model.Produto;

public class ProdutoRepository {
    private final List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

}
