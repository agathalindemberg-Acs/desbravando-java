package com.java.back.end;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.aplicaDescontoDe(0.1);
        livro.setIsbn("976-86-48234-43-6");
        autor.setNome("Rodrigo");
        autor.setEmail("rodrigo@gmail.com");
        autor.setCpf("283.012.293.02");

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("132-46-32134-21-6");
        outroAutor.setNome("Paulo");
        outroAutor.setEmail("paulo@gmail.com");
        outroAutor.setCpf("584.324.213.55");

        outroLivro.mostrarDetalhes();
    }
}