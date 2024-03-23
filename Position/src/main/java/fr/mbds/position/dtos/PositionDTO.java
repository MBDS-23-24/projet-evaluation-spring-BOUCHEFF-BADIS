package fr.mbds.position.dtos;

import fr.mbds.position.models.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class PositionDTO {
    private Long id;
    private String name;
    private double salaireMoyen;
    private List<Skill> skills;
    private List<Long> skillIds;
}
