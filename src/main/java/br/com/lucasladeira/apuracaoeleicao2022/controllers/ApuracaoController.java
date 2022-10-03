package br.com.lucasladeira.apuracaoeleicao2022.controllers;

import br.com.lucasladeira.apuracaoeleicao2022.entities.Resultado;
import br.com.lucasladeira.apuracaoeleicao2022.services.ApuracaoService;
import br.com.lucasladeira.apuracaoeleicao2022.services.TSEServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/apuracao-votos/2022")
public class ApuracaoController {

    @Autowired
    private ApuracaoService apuracaoService;

    @GetMapping("/presidencia")
    public ResponseEntity<Resultado> apuracaoCandidatosPresidencia() throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(apuracaoService.apuracaoCandidatosPresidencia());
    }
}
