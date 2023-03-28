package com.example.cricketspring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
public class TeamDto {
    @Id
    private int teamId;
    private String teamName;
    private ArrayList<String> players;


}
