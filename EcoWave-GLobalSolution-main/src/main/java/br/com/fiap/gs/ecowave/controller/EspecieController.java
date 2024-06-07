package br.com.fiap.gs.ecowave.controller;

import br.com.fiap.gs.ecowave.dto.EspecieDTO;
import br.com.fiap.gs.ecowave.service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/especies")
public class EspecieController {
    @Autowired
    private EspecieService especieService;

    @GetMapping("/{id}")
    public EspecieDTO getEspecieById(@PathVariable Long id) {
        return especieService.getEspecieById(id);
    }

    @PostMapping
    public EspecieDTO createEspecie(@RequestBody EspecieDTO especieDTO) {
        return especieService.saveEspecie(especieDTO);
    }

    @PutMapping("/{id}")
    public EspecieDTO updateEspecie(@PathVariable Long id, @RequestBody EspecieDTO especieDTO) {
        return especieService.updateEspecie(id, especieDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEspecie(@PathVariable Long id) {
        especieService.deleteEspecie(id);
    }
}
