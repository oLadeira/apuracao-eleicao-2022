package br.com.lucasladeira.apuracaoeleicao2022.entities;

public class Candidato {

    private String nm;
    private Long vap;

    public Candidato(){}

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public Long getVap() {
        return vap;
    }

    public void setVap(Long vap) {
        this.vap = vap;
    }
}
