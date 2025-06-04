package com.marcio.meumecanico.oficina.apllication.api;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@ToString
public class OficinaRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String cnpj;

    @NotBlank
    private String telefone;

    @NotBlank
    private String endereco;
}
