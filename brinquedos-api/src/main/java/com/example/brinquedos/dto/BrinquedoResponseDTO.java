package com.example.brinquedos.dto;

import com.example.brinquedos.model.Brinquedo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrinquedoResponseDTO {
    private Long id;
    private String nome;
    private String tipo;
    private String classificacao;
    private String tamanho;
    private Double preco;

    public BrinquedoResponseDTO(Brinquedo brinquedo) {
        this.id = brinquedo.getId();
        this.nome = brinquedo.getNome();
        this.tipo = brinquedo.getTipo();
        this.classificacao = brinquedo.getClassificacao();
        this.tamanho = brinquedo.getTamanho();
        this.preco = brinquedo.getPreco();
    }
}
