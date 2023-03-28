package com.example.cricketspring.controller;

import com.example.cricketspring.model.Player;
import com.example.cricketspring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player/")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player)
    {
        playerService.add(player);
        return player;
    }
    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable String id)
    {
        return playerService.getPlayer(id);
    }
}
