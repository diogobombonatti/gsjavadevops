package br.com.fiap.gs.ecowave.repository;

import br.com.fiap.gs.ecowave.model.Lixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LixoRepository extends JpaRepository<Lixo, Long> {}
