package com.example.cricketspring.controller;

import com.example.cricketspring.model.Team;
import com.example.cricketspring.model.TeamDto;
import com.example.cricketspring.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    ITeamService teamService;
    @PostMapping("/setTeam")
    public Team setTeam(@RequestBody TeamDto team)
    {
        return teamService.set(team);
    }
    @GetMapping("/getTeam/{id}")
    public Team getTeam(@PathVariable int id)
    {
        return teamService.getTeam(id);
    }

}
