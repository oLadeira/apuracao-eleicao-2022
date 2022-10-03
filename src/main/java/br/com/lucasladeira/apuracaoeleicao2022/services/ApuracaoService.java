package br.com.lucasladeira.apuracaoeleicao2022.services;

import br.com.lucasladeira.apuracaoeleicao2022.entities.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApuracaoService {

    @Autowired
    private TSEServiceImpl tseService;


    public Resultado apuracaoCandidatosPresidencia() throws Exception {
        return tseService.apuracaoCandidatosPresidencia();
    }
}
