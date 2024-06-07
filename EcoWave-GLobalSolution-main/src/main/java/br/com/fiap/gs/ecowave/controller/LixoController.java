package br.com.fiap.gs.ecowave.controller;

import br.com.fiap.gs.ecowave.dto.LixoDTO;
import br.com.fiap.gs.ecowave.service.LixoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lixo")
public class LixoController {
    @Autowired
    private LixoService lixoService;

    @GetMapping("/{id}")
    public LixoDTO getLixoById(@PathVariable Long id) {
        return lixoService.getLixoById(id);
    }

    @PostMapping
    public LixoDTO createLixo(@RequestBody LixoDTO lixoDTO) {
        return lixoService.saveLixo(lixoDTO);
    }

    @PutMapping("/{id}")
    public LixoDTO updateLixo(@PathVariable Long id, @RequestBody LixoDTO lixoDTO) {
        return lixoService.updateLixo(id, lixoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteLixo(@PathVariable Long id) {
        lixoService.deleteLixo(id);
    }
}
