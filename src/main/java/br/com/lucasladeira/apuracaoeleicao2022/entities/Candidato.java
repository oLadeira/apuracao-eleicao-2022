package br.com.lucasladeira.apuracaoeleicao2022.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Candidato {

    @JsonProperty("posicao")
    private Integer seq;

    @JsonProperty("nomeCandidato")
    private String nm;

    @JsonProperty("votosApurados")
    private Long vap;

    @JsonProperty("numero")
    private String n;

    @JsonProperty("partido")
    private String cc;

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

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
