package com.java.back.end;

public class Livro {
    public Livro(){
        System.out.println("Novo");
    }
    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("Mostrandos os conteúdos dos livros");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if(this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("---");
    }

    public void aplicaDescontoDe(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor(){
        return this.autor != null;
    }
}
