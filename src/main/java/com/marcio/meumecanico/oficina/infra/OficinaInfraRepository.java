package com.marcio.meumecanico.oficina.infra;

import com.marcio.meumecanico.oficina.apllication.oficina.OficinaRepository;
import com.marcio.meumecanico.oficina.domain.Oficina;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class OficinaInfraRepository implements OficinaRepository {
    private final OficinaSpringDataJPARepository springDataJPARepository;
    @Override
    public Oficina salva(Oficina oficina) {
        log.info("[inicia] OficinaInfraRepository - salva");
        Oficina oficinaSalva = springDataJPARepository.save(oficina);
        log.info("[finaliza] OficinaInfraRepository - salva");
        return oficinaSalva;
    }
}
