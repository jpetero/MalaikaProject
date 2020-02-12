package com.julio.malaika2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.julio.malaika2.repositories")
@SpringBootApplication
public class Malaika2Application {

    public static void main(String[] args) {
        SpringApplication.run(Malaika2Application.class, args);
    }

}
