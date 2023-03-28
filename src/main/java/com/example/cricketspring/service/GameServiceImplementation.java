package com.example.cricketspring.service;

import com.example.cricketspring.model.Game;
import com.example.cricketspring.model.Team;
import com.example.cricketspring.repository.GameScoreRepo;
import com.example.cricketspring.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImplementation implements IGameService{

    @Autowired
    TeamRepository teamRepository;
    @Autowired
    Game game;
    @Autowired
    GameScoreRepo gameScoreRepo;
    @Override
    public Game playCricket(int id1,int id2,int balls)
    {
        Team team1=teamRepository.findById(id1);
        Team team2=teamRepository.findById(id2);
        game.setTeam1(GameHelper.play(team1,false,balls));
        game.setTeam2(GameHelper.play(team2,true,balls));
        gameScoreRepo.save(game);
        return game;

    }
}
