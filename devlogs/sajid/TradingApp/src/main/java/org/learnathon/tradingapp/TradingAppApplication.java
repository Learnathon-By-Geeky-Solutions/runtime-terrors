package org.learnathon.tradingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("org.learnathon.tradingapp.model")
@EnableJpaRepositories("org.learnathon.tradingapp.repository")
public class TradingAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradingAppApplication.class, args);
    }
}