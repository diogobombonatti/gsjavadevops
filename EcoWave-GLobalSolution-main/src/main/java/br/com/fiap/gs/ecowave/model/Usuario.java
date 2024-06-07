package br.com.fiap.gs.ecowave.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TB_ECOWAVE_USUARIOS")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;
}
