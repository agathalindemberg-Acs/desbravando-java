package com.java.back.end.testes;

import com.java.back.end.produtos.Livro;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2){
        return l1.getNome().compareTo(l2.getNome());
    }
}
