package com.example.cricketspring.repository;

import com.example.cricketspring.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameScoreRepo extends MongoRepository<Game,String > {
}
