package com.java.back.end;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.aplicaDescontoDe(0.1);
        livro.isbn = "976-86-48234-43-6";
        Autor autor = new Autor();
        autor.nome = "Rodrigo";
        autor.email = "rodrigo@gmail.com";
        autor.cpf = "283.012.293.02";
        livro.autor = autor;
        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "132-46-32134-21-6";
        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo";
        outroAutor.email = "paulo@gmail.com";
        outroAutor.cpf = "584.324.213.55";
        outroLivro.autor=outroAutor;
        outroLivro.mostrarDetalhes();
    }
}