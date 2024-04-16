package fr.mbds.skill.mappers;

import fr.mbds.skill.dto.SkillDTO;
import fr.mbds.skill.entities.Skill;
import org.springframework.stereotype.Component;

@Component
public class SkillMapper {
    public SkillDTO toDTO(Skill skill){
        return new SkillDTO(skill.getId(), skill.getName());
    }

    public Skill toSkill(SkillDTO skillDTO){
        if(skillDTO != null)
            return new Skill(null, skillDTO.getName());
        return null;
    }
}
