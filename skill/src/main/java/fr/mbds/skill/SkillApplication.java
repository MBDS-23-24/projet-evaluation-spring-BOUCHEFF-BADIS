package fr.mbds.skill;

import fr.mbds.skill.entities.Skill;
import fr.mbds.skill.repositories.SkillRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SkillApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(SkillRepository skillRepository) {
		return args -> {
			List<Skill> accountList = List.of(
					Skill.builder()
							.nom("Python")
							.build(),
					Skill.builder()
							.nom("Java")
							.build()
			);
			skillRepository.saveAll(accountList);
		};
	}

}
