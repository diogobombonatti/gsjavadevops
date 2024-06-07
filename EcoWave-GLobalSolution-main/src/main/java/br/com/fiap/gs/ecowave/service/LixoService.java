package br.com.fiap.gs.ecowave.service;

import br.com.fiap.gs.ecowave.dto.LixoDTO;
import br.com.fiap.gs.ecowave.model.Lixo;
import br.com.fiap.gs.ecowave.repository.LixoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LixoService {
    @Autowired
    private LixoRepository lixoRepository;

    public LixoDTO getLixoById(Long id) {
        Lixo lixo = lixoRepository.findById(id).orElseThrow(() -> new RuntimeException("Tipo de lixo não encontrado"));
        return convertToDTO(lixo);
    }

    public LixoDTO saveLixo(LixoDTO lixoDTO) {
        Lixo lixo = convertToEntity(lixoDTO);
        lixo = lixoRepository.save(lixo);
        return convertToDTO(lixo);
    }

    public LixoDTO updateLixo(Long id, LixoDTO lixoDTO) {
        Lixo lixo = lixoRepository.findById(id).orElseThrow(() -> new RuntimeException("Tipo de lixo não encontrado"));
        lixo.setTipo(lixoDTO.getTipo());
        lixo.setQuantidade(lixoDTO.getQuantidade());
        lixo = lixoRepository.save(lixo);
        return convertToDTO(lixo);
    }

    public void deleteLixo(Long id) {
        Lixo lixo = lixoRepository.findById(id).orElseThrow(() -> new RuntimeException("Tipo de lixo não encontrado"));
        lixoRepository.delete(lixo);
    }

    private LixoDTO convertToDTO(Lixo lixo) {
        LixoDTO dto = new LixoDTO();
        dto.setId(lixo.getId());
        dto.setTipo(lixo.getTipo());
        dto.setQuantidade(lixo.getQuantidade());
        return dto;
    }

    private Lixo convertToEntity(LixoDTO dto) {
        Lixo lixo = new Lixo();
        lixo.setTipo(dto.getTipo());
        lixo.setQuantidade(dto.getQuantidade());
        return lixo;
    }
}
