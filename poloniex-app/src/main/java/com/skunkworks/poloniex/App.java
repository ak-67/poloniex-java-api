package com.skunkworks.poloniex;

import com.skunkworks.poloniex.api.Ticker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * stole on 16.07.17.
 */
@SpringBootApplication
@Slf4j
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner start() {
        return (args) -> {
            log.info("Poloniex.");
            RestTemplate restTemplate = new RestTemplate();
            Ticker ticker = restTemplate.getForObject(Ticker.URL, Ticker.class);
            log.info(ticker.toString());
        };
    }
}
