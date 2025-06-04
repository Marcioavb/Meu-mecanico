package com.marcio.meumecanico.oficina.domain;


import com.marcio.meumecanico.oficina.apllication.api.OficinaRequest;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@Getter
@ToString
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Entity
@Table(name = "oficinas")
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID idOficina;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Pattern(regexp = "\\d{14}", message = "CNPJ deve conter exatamente 14 dígitos")
    @Column(unique = true) // Garante unicidade no banco
    private String cnpj;

    @NotBlank(message = "Telefone é obrigatório")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve ter 10 ou 11 dígitos")
    private String telefone;

    @NotBlank(message = "Endereço é obrigatório")
    private String endereco;

    public Oficina(OficinaRequest oficinaRequest) {
        this.nome = oficinaRequest.getNome();
        this.cnpj = oficinaRequest.getCnpj();
        this.telefone = oficinaRequest.getTelefone();
        this.endereco = oficinaRequest.getEndereco();
    }
}
