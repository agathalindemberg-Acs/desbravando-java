package com.java.back.end.testes;

import com.java.back.end.produtos.Produto;

public class CarrinhoDeCompras {
    private double total;

    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }
}
