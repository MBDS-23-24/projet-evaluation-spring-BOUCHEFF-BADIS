package fr.mbds.position.entities;

import fr.mbds.position.models.Skill;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salaireMoyen;

    @Transient
    private List<Skill> skills;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<Long> skillIds;

}
