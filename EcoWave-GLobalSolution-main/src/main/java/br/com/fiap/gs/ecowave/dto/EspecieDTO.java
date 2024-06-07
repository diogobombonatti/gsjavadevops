package br.com.fiap.gs.ecowave.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EspecieDTO {
    // Getters e Setters
    private Long id;
    private String nomeComum;
    private String nomeCientifico;
    private String habitat;

}
