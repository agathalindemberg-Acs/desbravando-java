package com.java.back.end.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void mostrarDetalhes(){
        System.out.println("Mostrandos os autores dos livros");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
    }
}
