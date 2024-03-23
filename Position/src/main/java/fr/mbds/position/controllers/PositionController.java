package fr.mbds.position.controllers;

import fr.mbds.position.dtos.PositionDTO;
import fr.mbds.position.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {

    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/positions")
    public List<PositionDTO> getAllPositions() {
        return positionService.findAll();
    }

    @GetMapping("/position/{id}")
    public PositionDTO getPositionById(@PathVariable Long id) {
        return positionService.findById(id);
    }
}