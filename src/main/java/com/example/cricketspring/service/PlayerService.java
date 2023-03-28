package com.example.cricketspring.service;

import com.example.cricketspring.model.Player;
import com.example.cricketspring.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService implements IPlayerService{
    @Autowired
    PlayerRepository playerRepository;
    @Override
    public Player add(Player player) {
        playerRepository.save(player);
        return player;
    }

    @Override
    public Player getPlayer(String PlayerId) {
        Optional<Player>player=playerRepository.findById(PlayerId);
        return player.get();
    }
}
