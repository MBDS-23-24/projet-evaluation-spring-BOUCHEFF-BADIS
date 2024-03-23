package fr.mbds.position.clients;

import fr.mbds.position.entities.Position;
import fr.mbds.position.models.Skill;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "SKILL")

public interface SkillProxy {

    @GetMapping("/skill/{id}")
    @CircuitBreaker(name = "skill", fallbackMethod = "getDefaultSkill")

    public Skill getSkillById(@PathVariable Long id);
    @GetMapping("/skills")
    @CircuitBreaker(name = "position", fallbackMethod = "getAllPositions")
    public List<Skill> getAllSkills();

    default Skill getDefaultSkill(Long id, Exception exception)
    {
        Skill skill = new Skill();
        skill.setId(id);
        skill.setName("Not available");
        return skill;
    }
    default List<Skill> getAllPositions(Exception exception)
    {
        return List.of();
    }

}
