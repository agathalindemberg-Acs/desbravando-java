package com.java.back.end.produtos;

import java.util.*;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    //private Set<String> cupons;
    public GerenciadorDeCupons(){
        //this.cupons = new HashSet<String>();
        this.cupons = new HashMap<>();

        cupons.put("CUP74", 10.0);
        cupons.put("CUP152", 3.0);
        cupons.put("CUP982", 5.99);
        cupons.put("CUP14", 2.0);
        cupons.put("CUP745", 20.0);

        /*cupons.addAll(Arrays.asList("CUP74", "CUP158",
                "CUP14", "CUP52", "CUP21", "CUP221", "CUP91",
                "CUP327", "CUP410", "CUP275", "CUP484", "CUP207",
                "CUP96", "CUP119", "CUP174", "CUP291", "CUP1",
                "CUP115", "CUP222", "CUP272"));*/
    }

    public Double validaCupom(String cupom){
        //return this.cupons.contains(cupom);
        return this.cupons.get(cupom);
    }
}
