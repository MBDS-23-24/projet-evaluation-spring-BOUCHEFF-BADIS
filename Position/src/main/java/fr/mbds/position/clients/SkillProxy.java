package fr.mbds.position.clients;

import fr.mbds.position.entities.Position;
import fr.mbds.position.models.Skill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "position", url = "http://localhost:8080/")

public interface SkillProxy {

    @GetMapping("/position/{id}")
    public Skill getSkill(@PathVariable Long id);
    @GetMapping("/positions")
    public List<Skill> getSkills();

}
