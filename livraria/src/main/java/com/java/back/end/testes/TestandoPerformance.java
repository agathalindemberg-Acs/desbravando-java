package com.java.back.end.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerformance {
    public static void main(String[] args){

        //Set<String> colecao = new HashSet<String>();
        List<String> colecao = new ArrayList<String>();

        for (int i =0; i<10000; i++){
            colecao.add( "Item"+ i);
        }
        long inicio =System.currentTimeMillis();

        for (int i =0; i <10000; i++){
            colecao.contains("Item" + i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou " + tempo + " MS para executar");
    }
}
