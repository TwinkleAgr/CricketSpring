package com.example.cricketspring.controller;

import com.example.cricketspring.model.Game;
import com.example.cricketspring.model.Team;
import com.example.cricketspring.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("game")
public class GameController {
    @Autowired
    IGameService gameService;
    @GetMapping("/play/{team1Id}/{team2Id}/{balls}")
    public Game play(@PathVariable int team1Id,@PathVariable int team2Id,@PathVariable int balls)
    {
        return gameService.playCricket(team1Id,team2Id,balls);
    }
}
