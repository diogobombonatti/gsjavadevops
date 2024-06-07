package br.com.fiap.gs.ecowave.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TB_ECOWAVE_ESPECIES")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeComum;

    @Column(nullable = false)
    private String nomeCientifico;

    @Column(nullable = false)
    private String habitat;
}
