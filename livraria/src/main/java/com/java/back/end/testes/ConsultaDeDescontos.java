package com.java.back.end.testes;

import com.java.back.end.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    public static void main(String[] args){
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("CUP74");

        if(desconto != null){
            System.out.println("Cupom de desconto válido.");
            System.out.println("Valor " + desconto);
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }
}
