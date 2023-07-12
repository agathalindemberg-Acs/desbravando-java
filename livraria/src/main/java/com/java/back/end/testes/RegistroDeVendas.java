package com.java.back.end.testes;

import com.java.back.end.livraria.Autor;
import com.java.back.end.produtos.Ebook;
import com.java.back.end.produtos.LivroFisico;
import com.java.back.end.produtos.Produto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Teste");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("teste 2");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(fisico,	ebook);
        Collections.sort(produtos);

        for (Produto produto : produtos) {
            try {
                System.out.println(produto.getValor());
            } catch (ClassCastException e) {
                System.out.println("O objeto passado não implementa Produto");
            }
        }
    }
}
