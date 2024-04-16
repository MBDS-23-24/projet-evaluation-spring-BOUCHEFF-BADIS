package fr.mbds.skill.controllers;

import fr.mbds.skill.dto.SkillDTO;
import fr.mbds.skill.entities.Skill;
import fr.mbds.skill.models.Position;
import fr.mbds.skill.repositories.SkillRepository;
import fr.mbds.skill.services.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {

    SkillService skillService;
    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }

    @GetMapping("/skills")
    public List<SkillDTO> getAllSkills(){
        return skillService.findAll();

    }

    @GetMapping("/skill/{id}")
    public SkillDTO getSkillById(@PathVariable Long id){
        return skillService.findById(id);
    }
}
