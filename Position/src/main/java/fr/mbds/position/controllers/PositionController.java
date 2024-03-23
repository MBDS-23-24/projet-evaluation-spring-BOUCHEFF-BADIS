package fr.mbds.position.controllers;

import fr.mbds.position.clients.SkillProxy;
import fr.mbds.position.entities.Position;
import fr.mbds.position.models.Skill;
import fr.mbds.position.repositories.PositionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PositionController {
    private final PositionRepository positionRepository;
    private final SkillProxy skillProxy;

    public PositionController(PositionRepository positionRepository, SkillProxy skillProxy){
        this.positionRepository = positionRepository;
        this.skillProxy = skillProxy;
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions(){
        List<Position> positionList = positionRepository.findAll();
        positionList.forEach(position -> {
            List<Skill> skills = new ArrayList<>();
            for (Long skillId : position.getSkillIds()) {
                Skill skill = skillProxy.getSkillById(skillId);
                skills.add(skill);
            }
            position.setSkills(skills);
        });
        return positionList;
    }

    @GetMapping("/position/{id}")
    public Position getPositionById(@PathVariable Long id){
        Position positionInstance = positionRepository.findById(id).orElse(null);
        if (positionInstance == null) {
            return null;
        }
        List<Skill> skills = new ArrayList<>();
        for (Long skillId : positionInstance.getSkillIds()) {
            Skill skill = skillProxy.getSkillById(skillId);
            skills.add(skill);
        }
        positionInstance.setSkills(skills);

        return positionInstance;
    }

}
