package fr.mbds.skill.services;

import fr.mbds.skill.dto.SkillDTO;

import java.util.List;

public interface SkillService {
    List<SkillDTO> findAll();
    SkillDTO findById(Long id);
}
