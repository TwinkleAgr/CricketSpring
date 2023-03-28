package com.example.cricketspring.service;

import com.example.cricketspring.model.Player;
import com.example.cricketspring.model.Team;
import com.example.cricketspring.model.TeamDto;
import com.example.cricketspring.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class TeamServiceImplementation implements ITeamService{
    RestTemplate restTemplate;
    @Autowired
    PlayerService playerService;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    Team currentTeam;
    @Override
    public Team set(TeamDto team) {
        ArrayList<Player>players=new ArrayList<>();
        for(String s:team.getPlayers())
        {
            players.add(playerService.getPlayer(s));
        }
        currentTeam.setTeamId(team.getTeamId());
        currentTeam.setTeamName(team.getTeamName());
        currentTeam.setPlayers(players);
        teamRepository.save(currentTeam);
        return currentTeam;
    }

    @Override
    public Team getTeam(int id) {
        return teamRepository.findById(id);
    }


}
