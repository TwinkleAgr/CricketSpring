package com.example.cricketspring;

import com.example.cricketspring.model.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CricketSpringApplication {

//    @Bean
//    public Team getTeam()
//    {
//        return new Team();
//    }
    public static void main(String[] args) {

        SpringApplication.run(CricketSpringApplication.class, args);
    }

}
