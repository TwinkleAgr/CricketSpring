package com.example.cricketspring.repository;

import com.example.cricketspring.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player,String> {
}
