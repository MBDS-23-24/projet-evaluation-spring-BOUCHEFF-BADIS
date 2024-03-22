package fr.mbds.position.controllers;

import fr.mbds.position.clients.SkillProxy;
import fr.mbds.position.entities.Position;
import fr.mbds.position.repositories.PositionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {
    private final PositionRepository positionRepository;
    private final SkillProxy skillProxy;

    public PositionController(PositionRepository positionRepository, SkillProxy skillProxy){
        this.positionRepository = positionRepository;
        this.skillProxy = skillProxy;
    }

    @GetMapping("/positions")
    public List<Position> getPositions(){
        List<Position> positionList = positionRepository.findAll();
        positionList.forEach(position -> {
            position.setSkills(skillProxy.getSkills());
        });
        return positionList;
    }

    /*
    @GetMapping("/position/{id}")
    public Position getPosition(@PathVariable Long id){
        Position positionInstance = positionRepository.findById(id).orElse(null);
        if (positionInstance == null) {
            return null;
        }
        Position position = positionClient.getCustomerById(positionInstance.());
        positionInstance.setPosition(position);
        return positionInstance;
    }

     */
}
