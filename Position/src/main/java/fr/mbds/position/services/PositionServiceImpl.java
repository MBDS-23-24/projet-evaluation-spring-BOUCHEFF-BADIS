package fr.mbds.position.services;

import fr.mbds.position.clients.SkillProxy;
import fr.mbds.position.models.Skill;
import fr.mbds.position.dtos.PositionDTO;
import fr.mbds.position.entities.Position;
import fr.mbds.position.mappers.PositionMapper;
import fr.mbds.position.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private final PositionRepository positionRepository;
    private final SkillProxy skillProxy;
    private final PositionMapper positionMapper;

    @Autowired
    public PositionServiceImpl(PositionRepository positionRepository, SkillProxy skillProxy, PositionMapper positionMapper) {
        this.positionRepository = positionRepository;
        this.skillProxy = skillProxy;
        this.positionMapper = positionMapper;
    }

    @Override
    public List<PositionDTO> findAll() {
        List<Position> positions = positionRepository.findAll();
        List<PositionDTO> positionDTOs = new ArrayList<>();
        for (Position position : positions) {
            PositionDTO positionDTO = positionMapper.toDTO(position);
            List<Skill> skills = new ArrayList<>();
            for (Long skillId : position.getSkillIds()) {
                Skill skill = skillProxy.getSkillById(skillId);
                skills.add(skill);
            }
            positionDTO.setSkills(skills);
            positionDTOs.add(positionDTO);
        }
        return positionDTOs;
    }

    @Override
    public PositionDTO findById(Long id) {
        Position position = positionRepository.findById(id).orElse(null);
        if (position == null) {
            return null;
        }
        PositionDTO positionDTO = positionMapper.toDTO(position);
        List<Skill> skills = new ArrayList<>();
        for (Long skillId : position.getSkillIds()) {
            Skill skill = skillProxy.getSkillById(skillId);
            skills.add(skill);
        }
        positionDTO.setSkills(skills);
        return positionDTO;
    }
}