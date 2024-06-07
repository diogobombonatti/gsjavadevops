package br.com.fiap.gs.ecowave.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TB_ECOWAVE_LIXO")
public class Lixo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private int quantidade;
}
