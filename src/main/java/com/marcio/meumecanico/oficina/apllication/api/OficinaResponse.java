package com.marcio.meumecanico.oficina.apllication.api;

import com.marcio.meumecanico.oficina.domain.Oficina;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@ToString
public class OficinaResponse {

    private UUID idOficina;
    @NotBlank
    private String nome;
    @NotBlank
    private String cnpj;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;

    public OficinaResponse(Oficina oficina) {
        this.idOficina = oficina.getIdOficina();
        this.nome = oficina.getNome();
        this.cnpj = oficina.getCnpj();
        this.telefone = oficina.getTelefone();
        this.endereco = oficina.getEndereco();
    }
}
