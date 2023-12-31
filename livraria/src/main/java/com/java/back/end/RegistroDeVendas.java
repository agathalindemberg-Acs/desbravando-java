package com.java.back.end;

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


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());
    }
}
