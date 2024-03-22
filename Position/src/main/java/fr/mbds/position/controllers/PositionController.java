package fr.mbds.position.controllers;

import fr.mbds.position.entities.Position;
import fr.mbds.position.repositories.PositionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {
    private final PositionRepository positionRepository;

    public PositionController(PositionRepository positionRepository){
        this.positionRepository = positionRepository;
    }

    @GetMapping("/positions")
    public List<Position> getPositions(){
        return positionRepository.findAll();
    }

    @GetMapping("/position/{id}")
    public Position getPosition(@PathVariable Long id){
        return positionRepository.findById(id).orElse(null);
    }
}
