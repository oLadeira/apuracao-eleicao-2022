package br.com.lucasladeira.apuracaoeleicao2022.entities;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

    private List<Candidato> cand = new ArrayList<>();


    public Resultado(){}


    public List<Candidato> getCand() {
        return cand;
    }
}
