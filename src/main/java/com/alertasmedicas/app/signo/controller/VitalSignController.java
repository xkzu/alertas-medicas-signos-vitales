package com.alertasmedicas.app.signo.controller;

import com.alertasmedicas.app.signo.dto.VitalSignDTO;
import com.alertasmedicas.app.signo.service.VitalSignService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/vitalSign")
public class VitalSignController {

    private final VitalSignService vitalSignService;

    @Autowired
    public VitalSignController(VitalSignService vitalSignService) {
        this.vitalSignService = vitalSignService;
    }

    @GetMapping("/getSign/{id}")
    public ResponseEntity<VitalSignDTO> getSign(@PathVariable long id) {
        log.info("Obteniendo signo con id: {}", id);
        try {
            VitalSignDTO signDTO = vitalSignService.getSignAsDTO(id);
            log.info("Signo obtenido exitosamente: {}", signDTO);
            return ResponseEntity.ok(signDTO);
        } catch (Exception e) {
            log.error("Error al obteniendo signo con id: {}, {}", id, e.getMessage(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/getVitalSigns")
    public ResponseEntity<List<VitalSignDTO>> getVitalSigns() {
        log.info("Obteniendo todos los signos vitales");
        try {
            List<VitalSignDTO> vitalSigns = vitalSignService.getVitalSignsAsDTO();
            log.info("Lista de signos vitales obtenida exitosamente. Total: {} signos.", vitalSigns.size());
            return ResponseEntity.ok(vitalSigns);
        } catch (Exception e) {
            log.error("Error al obtener todos los signos vitales: {}, {}", e.getMessage(), e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
