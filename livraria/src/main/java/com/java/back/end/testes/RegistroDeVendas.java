package com.java.back.end.testes;

import com.java.back.end.livraria.Autor;
import com.java.back.end.produtos.Ebook;
import com.java.back.end.produtos.LivroFisico;
import com.java.back.end.produtos.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(null);
        fisico.setNome("Teste");
        fisico.setValor(59.90);


        Ebook ebook = new Ebook(autor);
        ebook.setNome("teste 2");
        ebook.setValor(29.90);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        Produto[] produtos = carrinho.getProdutos();
        for (int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println((produto.getValor()));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Deu exception no índice: " + i);
            } catch (NullPointerException e) {
                System.out.println("A array não foi instanciado!");
            }
            System.out.println("Fui executado");
            System.out.println("Total: " + carrinho.getTotal());
        }
    }
}