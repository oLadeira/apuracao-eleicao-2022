package br.com.lucasladeira.apuracaoeleicao2022.services;

import br.com.lucasladeira.apuracaoeleicao2022.configs.RetrofitConfig;
import br.com.lucasladeira.apuracaoeleicao2022.entities.Resultado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class TSEServiceImpl {

    @Autowired
    private RetrofitConfig retrofit;

    private final String BASE_URL = "https://resultados.tse.jus.br/oficial/";

    private final Logger log = LoggerFactory.getLogger(TSEServiceImpl.class);

    public Resultado apuracaoCandidatosPresidencia() throws Exception {
        TSEService apiService = retrofit
                .retrofitBuilder(BASE_URL)
                .create(TSEService.class);

        Call<Resultado> call = apiService.apuracaoCandidatosPresidencia();

        try {
            Response<Resultado> resultado = call.execute();
            log.info("Resposta da API: ${resultado}");
            return resultado.body();
        } catch (Exception e) {
            log.info("Erro na chamada de API TSE");
            throw new Exception("Erro na chamada de API TSE");
        }
    }
}
