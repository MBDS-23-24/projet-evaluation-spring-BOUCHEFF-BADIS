package fr.mbds.position.mappers;

import fr.mbds.position.dtos.PositionDTO;
import fr.mbds.position.entities.Position;
import org.springframework.stereotype.Component;

@Component
public class PositionMapper {
    public PositionDTO toDTO(Position position)
    {
        return new PositionDTO(position.getId(), position.getName(),
                position.getSalaireMoyen(), position.getSkills(), position.getSkillIds());
    }
    public Position toPosition(PositionDTO positionDTO)
    {
        if (positionDTO != null)
            return new Position(null, positionDTO.getName(),
                    positionDTO.getSalaireMoyen(), positionDTO.getSkills(), positionDTO.getSkillIds());
        return null;
    }

}
