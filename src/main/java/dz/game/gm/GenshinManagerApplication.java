package dz.game.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "dz.game.gm.repository")
public class GenshinManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GenshinManagerApplication.class, args);
    }
}