package fr.mbds.skill.entities;

import fr.mbds.skill.models.Position;
import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

}
