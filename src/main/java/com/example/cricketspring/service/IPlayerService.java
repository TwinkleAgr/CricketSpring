package com.example.cricketspring.service;

import com.example.cricketspring.model.Player;
import com.example.cricketspring.repository.PlayerRepository;

public interface IPlayerService {
     Player add(Player player);
     Player getPlayer(String PlayerId);
}
