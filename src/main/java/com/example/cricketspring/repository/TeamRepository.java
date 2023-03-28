package com.example.cricketspring.repository;

import com.example.cricketspring.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<Team,Integer> {
   @Query("{'teamId':?0}")
   Team findById(int id);
}
