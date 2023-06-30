package com.java.back.end.produtos;

import com.java.back.end.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no LivroFísico");
        return true;
    }
}
