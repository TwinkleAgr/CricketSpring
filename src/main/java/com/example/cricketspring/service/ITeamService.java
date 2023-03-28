package com.example.cricketspring.service;

import com.example.cricketspring.model.Team;
import com.example.cricketspring.model.TeamDto;

public interface ITeamService {
    Team set(TeamDto team);
//    Team update(Team team);
    Team getTeam(int id);
}
