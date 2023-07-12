package com.java.back.end.testes;

import com.java.back.end.livraria.Autor;
import com.java.back.end.produtos.Livro;
import com.java.back.end.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NovidadesDoJava8 {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.o.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
        Collections.sort(livros, new ComparadorPorNome());

        for (Livro livro : livros){
            System.out.println(livro.getNome());
        }
    }
}
