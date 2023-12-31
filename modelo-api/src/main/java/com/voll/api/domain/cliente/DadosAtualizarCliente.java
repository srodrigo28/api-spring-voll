package com.voll.api.domain.cliente;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizarCliente(
    @NotBlank
    Long id,
    String nome,
    String email) {
}
