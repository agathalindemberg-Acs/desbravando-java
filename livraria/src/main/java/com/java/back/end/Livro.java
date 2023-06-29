package com.java.back.end;

public abstract class Livro {
    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private String nomeDoAutor;
    private String emailDoAutor;
    private String cpfDoAutor;
    private Autor autor;
    private boolean impresso;

    void mostrarDetalhes() {
        System.out.println("Mostrandos os conteúdos dos livros");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("---");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public abstract boolean aplicaDescontoDe(double porcentagem);

    boolean temAutor() {
        return this.autor != null;
    }
}
