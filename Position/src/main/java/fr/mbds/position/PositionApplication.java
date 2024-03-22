package fr.mbds.position;

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
    CommandLineRunner commandLineRunner(PositionRepository positionRepository) {
        return args -> {
            List<Position> positionsList = List.of(
                    Position.builder()
                            .name("Developpeur")
                            .salaireMoyen(3000)
                            .build(),
                    Position.builder()
                            .name("Product Owner")
                            .salaireMoyen(3000)
                            .build()
            );
            positionRepository.saveAll(positionsList);
        };
    }

}
