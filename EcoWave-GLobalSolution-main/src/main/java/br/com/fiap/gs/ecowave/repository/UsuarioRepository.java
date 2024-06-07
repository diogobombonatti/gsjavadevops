package br.com.fiap.gs.ecowave.repository;

import br.com.fiap.gs.ecowave.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
