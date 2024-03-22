package fr.mbds.skill.repositories;

import fr.mbds.skill.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, String> {
}
