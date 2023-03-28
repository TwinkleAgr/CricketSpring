package com.example.cricketspring.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@Document
@Component
public class Game {
    public static int target;
    private Team team1;
    private Team team2;

}
