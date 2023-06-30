package com.java.back.end.testes;

import com.java.back.end.livraria.Autor;
import com.java.back.end.produtos.Ebook;
import com.java.back.end.produtos.Revista;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Agatha");
        Revista revista = new Revista();
        revista.setValor(39.90);

        if(!revista.aplicaDescontoDe(0.3)){
            System.out.println("Desconto do livro não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: " + revista.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto do ebook não pode ser maior que 15%");
        } else {
            System.out.println("Valor com desconto: " + ebook.getValor());
        }
    }
}
