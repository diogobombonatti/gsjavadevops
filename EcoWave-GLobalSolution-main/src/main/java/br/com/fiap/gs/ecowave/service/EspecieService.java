package br.com.fiap.gs.ecowave.service;

import br.com.fiap.gs.ecowave.dto.EspecieDTO;
import br.com.fiap.gs.ecowave.model.Especie;
import br.com.fiap.gs.ecowave.repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecieService {
    @Autowired
    private EspecieRepository especieRepository;

    public EspecieDTO getEspecieById(Long id) {
        Especie especie = especieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Espécie não encontrada"));
        return convertToDTO(especie);
    }

    public EspecieDTO saveEspecie(EspecieDTO especieDTO) {
        Especie especie = convertToEntity(especieDTO);
        especie = especieRepository.save(especie);
        return convertToDTO(especie);
    }

    public EspecieDTO updateEspecie(Long id, EspecieDTO especieDTO) {
        Especie especie = especieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Espécie não encontrada"));
        especie.setNomeComum(especieDTO.getNomeComum());
        especie.setNomeCientifico(especieDTO.getNomeCientifico());
        especie.setHabitat(especieDTO.getHabitat());
        especie = especieRepository.save(especie);
        return convertToDTO(especie);
    }

    public void deleteEspecie(Long id) {
        Especie especie = especieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Espécie não encontrada"));
        especieRepository.delete(especie);
    }

    private EspecieDTO convertToDTO(Especie especie) {
        EspecieDTO dto = new EspecieDTO();
        dto.setId(especie.getId());
        dto.setNomeComum(especie.getNomeComum());
        dto.setNomeCientifico(especie.getNomeCientifico());
        dto.setHabitat(especie.getHabitat());
        return dto;
    }

    private Especie convertToEntity(EspecieDTO dto) {
        Especie especie = new Especie();
        especie.setNomeComum(dto.getNomeComum());
        especie.setNomeCientifico(dto.getNomeCientifico());
        especie.setHabitat(dto.getHabitat());
        return especie;
    }
}
