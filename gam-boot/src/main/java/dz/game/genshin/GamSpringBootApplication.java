package dz.game.genshin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dz.game.genshin")
public class GamSpringBootApplication {
    //
    public static void main(String[] args) {
        //
        SpringApplication.run(GamSpringBootApplication.class, args);
    }
}
