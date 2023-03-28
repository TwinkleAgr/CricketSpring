package com.example.cricketspring.service;

import com.example.cricketspring.model.Game;
import com.example.cricketspring.model.Team;

public interface IGameService {

    Game playCricket(int id1,int id2,int balls);
}
