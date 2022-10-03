package br.com.lucasladeira.apuracaoeleicao2022.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

    @JsonProperty("dataUltimaAtualizacao")
    private String dt;

    @JsonProperty("horaUltimaAtualizacao")
    private String ht;

    @JsonProperty("secoesFinalizadas")
    private String pesi;

    @JsonProperty("votosNulo")
    private Long vn;

    @JsonProperty("votosBranco")
    private Long vb;

    @JsonProperty("votosValidos")
    private Long vvc;

    @JsonProperty("candidatos")
    private List<Candidato> cand = new ArrayList<>();


    public Resultado(){}


    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getPesi() {
        return pesi;
    }

    public void setPesi(String pesi) {
        this.pesi = pesi;
    }

    public Long getVn() {
        return vn;
    }

    public void setVn(Long vn) {
        this.vn = vn;
    }

    public Long getVb() {
        return vb;
    }

    public void setVb(Long vb) {
        this.vb = vb;
    }

    public Long getVvc() {
        return vvc;
    }

    public void setVvc(Long vvc) {
        this.vvc = vvc;
    }

    public List<Candidato> getCand() {
        return cand;
    }
}
