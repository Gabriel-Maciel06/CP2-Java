package com.example.brinquedos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrinquedoRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O tipo é obrigatório")
    private String tipo;

    @NotBlank(message = "A classificação é obrigatória")
    private String classificacao;

    @NotBlank(message = "O tamanho é obrigatório")
    private String tamanho;

    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    private Double preco;
}
