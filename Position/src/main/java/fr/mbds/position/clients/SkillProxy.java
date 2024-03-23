package fr.mbds.position.clients;

import fr.mbds.position.entities.Position;
import fr.mbds.position.models.Skill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "SKILL")

public interface SkillProxy {

    @GetMapping("/skill/{id}")
    public Skill getSkillById(@PathVariable Long id);
    @GetMapping("/skills")
    public List<Skill> getAllSkills();

}
