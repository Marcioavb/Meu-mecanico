package com.marcio.meumecanico.oficina.apllication.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/oficina")
@Tag(name = "oficina", description = "Endpoints para cadastrar oficinas.")
public interface OficinaApi {

    @PostMapping
    @Operation(summary = "Cadastra uma nova oficina")
    @ResponseStatus(HttpStatus.CREATED)
    OficinaResponse cadastroOficina(@RequestBody OficinaRequest oficinaRequest);
}
