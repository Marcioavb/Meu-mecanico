package com.marcio.meumecanico.oficina.infra;

import com.marcio.meumecanico.oficina.domain.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OficinaSpringDataJPARepository extends JpaRepository<Oficina, UUID> {
}
