package com.marcio.meumecanico.oficina.apllication.api;

import com.marcio.meumecanico.oficina.apllication.service.OficinaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Log4j2
@RestController
public class OficinaController implements OficinaApi {
    private final OficinaService oficinaService;

    @Override
    public OficinaResponse cadastroOficina(OficinaRequest oficinaRequest) {
        log.info("[inicia] OficinaController - cadastroOficina");
        OficinaResponse oficinaCriada = oficinaService.cadastraOficina(oficinaRequest);
        log.info("[finaliza] OficinaController - cadastroOficina");
        return oficinaCriada;
    }
}
