package com.java.back.end.testes;

import java.io.FileNotFoundException;

public class Testes {
    public static void main(String[] args) {

        /* TESTANTO CONSTRUTOR
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        Livro livro4 = new Livro();
        Livro livro5 = new Livro();*/


        /* TESTE DE SAÍDA DO NOME
        Autor autor = new Autor();
        autor.nome = "Rodrigo";
        Livro outroLivro = new Livro();
        outroLivro.autor=autor;
        outroLivro.autor.nome = "guilherme";
        System.out.println(autor.nome);*/


        try	{
            new	java.io.FileInputStream("arquivo.txt");
        }	catch	(FileNotFoundException	e1)	{
            System.out.println("Não	consegui	abrir	o	arquivo");
        }
        /*public	void	abreArquivo()	throws	FileNotFoundException	{
            new	java.io.FileInputStream("arquivo.txt");
        }

        try {
            abreArquivo();
        } catch (FileNotFoundException e){
            System.out.println("Nao consegui desculpa;-");
        }*/
    }
}
