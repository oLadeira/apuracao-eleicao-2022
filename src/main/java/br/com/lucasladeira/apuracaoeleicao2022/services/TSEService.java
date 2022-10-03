package br.com.lucasladeira.apuracaoeleicao2022.services;

import br.com.lucasladeira.apuracaoeleicao2022.entities.Resultado;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TSEService {

    @GET("ele2022/544/dados-simplificados/br/br-c0001-e000544-r.json")
    Call<Resultado> apuracaoCandidatosPresidencia();
}
