package no.bouvet;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Game game() {
        return new Game();
    }

}
