package com.example.cricketspring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Data
@Document
@Component
public class Team {
    @Id
    private int teamId;
    private String teamName;
    private ArrayList<Player>players;
    private int teamScore;
    private int teamWickets;

}
