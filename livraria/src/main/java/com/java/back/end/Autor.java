package com.java.back.end;

public class Autor {
    String nome;
    String email;
    String cpf;

    void mostrarDetalhes(){
        System.out.println("Mostrandos os autores dos livros");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}
