package com.java.back.end.produtos;

import com.java.back.end.livraria.Editora;

public class Revista implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

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

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;
    }
}
