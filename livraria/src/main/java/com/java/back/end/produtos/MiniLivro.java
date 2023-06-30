package com.java.back.end.produtos;

import com.java.back.end.livraria.Autor;

public class MiniLivro extends Livro implements Promocional {
    public MiniLivro (Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}
