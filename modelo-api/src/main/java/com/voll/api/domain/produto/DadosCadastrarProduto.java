package com.voll.api.domain.produto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastrarProduto(

    @NotBlank
    String nome,

    @NotBlank
    String descricao,

    @NotBlank
    Integer quantidade,
    
    @NotBlank
    Float valor) {
    
}
