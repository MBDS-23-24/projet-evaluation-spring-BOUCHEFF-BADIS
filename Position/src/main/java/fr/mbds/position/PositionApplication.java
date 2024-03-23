package fr.mbds.position;

import fr.mbds.position.clients.SkillProxy;
import fr.mbds.position.entities.Position;
import fr.mbds.position.repositories.PositionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class PositionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PositionApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PositionRepository positionRepository, SkillProxy skillProxy) {
        return args -> {
            Position position1 = new Position(1L, "Développeur", 3000, null, List.of(1L, 2L));
            Position position2 = new Position(2L, "Product Owner", 3000, null, List.of(2L, 3L));
            Position position3 = new Position(3L, "Designer", 3000, null, List.of(3L, 4L));

            positionRepository.save(position1);
            positionRepository.save(position2);
            positionRepository.save(position3);
        };
    }

}
