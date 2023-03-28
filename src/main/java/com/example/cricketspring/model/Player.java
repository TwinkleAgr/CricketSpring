package com.example.cricketspring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Player {
    @Id
    private String playerId;
    private String playerName;
    private int ballsPlayed;
    private int runScored;
    private int battingRating;
}
