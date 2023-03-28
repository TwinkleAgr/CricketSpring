package com.example.cricketspring.service;

import com.example.cricketspring.model.Game;
import com.example.cricketspring.model.Player;
import com.example.cricketspring.model.Team;

import java.util.ArrayList;

public class GameHelper {
    private static String [] events={"W","1","2","3","4","4","6","6","6","6"};

    public static Team play(Team team,boolean isSecond,int balls)
    {
        ArrayList<Player>players=team.getPlayers();
        int striker=0,nonstriker=1,next=2;
        int score=0,wickets=0,currentBalls=0;
        while (currentBalls<balls && wickets<10)
        {
            Player player=players.get(striker);
            currentBalls++;
            player.setBallsPlayed(player.getBallsPlayed()+1);
            int index=(int) (Math.random()*player.getBattingRating());
            String event=events[index];
            if(event.equals("W"))
            {
                wickets++;
                striker=next;
                next++;
                team.setTeamWickets(wickets);
            }
            else {
                Integer run= Integer.parseInt(event);
                score+=run;
                player.setRunScored(player.getRunScored()+run);
                team.setTeamScore(score);
                if(isSecond==true && Game.target<=score)
                {
                    break;
                }
                if(run%2==1 || currentBalls%6==0)
                {
                    int tm=striker;
                    striker=nonstriker;
                    nonstriker=tm;
                }
            }
        }
        if(isSecond==false)
        {
            Game.target=team.getTeamScore()+1;
        }
        return team;
    }
}
