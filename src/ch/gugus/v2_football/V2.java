package ch.gugus.v2_football;

import java.util.ArrayList;
import java.util.List;

public class V2 {
    public void run()
    {
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < 17; i++) {
            players.add(new Attacker("Attacker " + i));
            players.add(new Defender("Defender " + i));
        }

        players.add(new Goalie("Goalie 1"));
        Team team = new Team(players);

        team.play();
    }
}
