package com.marcio.meumecanico.oficina.apllication.service;

import com.marcio.meumecanico.oficina.apllication.api.OficinaRequest;
import com.marcio.meumecanico.oficina.apllication.api.OficinaResponse;
import com.marcio.meumecanico.oficina.apllication.oficina.OficinaRepository;
import com.marcio.meumecanico.oficina.domain.Oficina;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class OficinaapllicationService implements OficinaService {
    private final OficinaRepository oficinaRepository;
    @Override
    public OficinaResponse cadastraOficina(OficinaRequest oficinaRequest) {
        log.info("[inicia] OficinaapllicationService - cadastraOficina");
        Oficina oficina = oficinaRepository.salva(new Oficina(oficinaRequest));
        log.info("[finaliza] OficinaapllicationService - cadastraOficina");
        return new OficinaResponse(oficina);
    }
}
