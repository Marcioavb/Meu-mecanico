package com.marcio.meumecanico.oficina.apllication.service;

import com.marcio.meumecanico.oficina.apllication.api.OficinaRequest;
import com.marcio.meumecanico.oficina.apllication.api.OficinaResponse;

public interface OficinaService {
    OficinaResponse cadastraOficina(OficinaRequest oficinaRequest);
}
