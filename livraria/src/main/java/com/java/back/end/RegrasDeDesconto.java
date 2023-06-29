package com.java.back.end;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Agatha");
        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto do livro pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
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