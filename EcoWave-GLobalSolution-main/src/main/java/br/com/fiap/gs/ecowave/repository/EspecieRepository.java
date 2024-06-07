package br.com.fiap.gs.ecowave.repository;



import br.com.fiap.gs.ecowave.model.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Long> {}
