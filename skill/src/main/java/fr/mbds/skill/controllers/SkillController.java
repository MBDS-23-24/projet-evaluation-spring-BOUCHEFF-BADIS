package fr.mbds.skill.controllers;

import fr.mbds.skill.entities.Skill;
import fr.mbds.skill.models.Position;
import fr.mbds.skill.repositories.SkillRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {
    private SkillRepository skillRepository;

    public SkillController(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }

    @GetMapping("/skills")
    public List<Skill> getAllSkills(){
        return skillRepository.findAll();

    }

    @GetMapping("/skill/{id}")
    public Skill getSkillById(@PathVariable String id){
        return skillRepository.findById(id).orElse(null);
    }
}
