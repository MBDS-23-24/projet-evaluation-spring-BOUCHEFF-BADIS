package fr.mbds.skill.services;

import fr.mbds.skill.dto.SkillDTO;
import fr.mbds.skill.entities.Skill;
import fr.mbds.skill.mappers.SkillMapper;
import fr.mbds.skill.repositories.SkillRepository;
import fr.mbds.skill.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }

    @Override
    public List<SkillDTO> findAll() {
        List<Skill> skills = skillRepository.findAll();
        return skills.stream()
                .map(skillMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SkillDTO findById(Long id) {
        Skill skill = skillRepository.findById(id).orElse(null);
        if(skill != null)
            return skillMapper.toDTO(skill);
        return null;
    }
}